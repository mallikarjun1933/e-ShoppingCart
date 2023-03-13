package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.Account;
import com.example.EShoppingCart.User.Model.Role;
import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.SD.ERole;
import com.example.EShoppingCart.User.SD.Status;
import com.example.EShoppingCart.User.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;
import java.sql.Date;
import java.time.Period;
import java.util.List;

@Service
public class IRegisterService implements RegisterService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public APIResponse createUser(User user) {
        try {
            if (isUserExist(user)) {
                return new APIResponse<User>(1001, "User already exist with this Email" + user.getEmail());
            }
            if (isMinor(user.getDateOfBirth())) {
                return new APIResponse<User>(1002, "User age must be less than 18 only" + user.getEmail());
            }
            Account acc = new Account();
            acc.setCreatedDate(Date.valueOf(LocalDate.now()));
            acc.setStatus(Status._Active);
            user.setAccount(acc);
            Role role = new Role();
            role.setRol(ERole._Admin);
            user.getRoles().add(role);
            userRepo.save(user);
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
        return new APIResponse<User>(201,"User Created Successfully");
    }

    @Override
    public boolean isMinor(Date DateOfBirth) {
        return Period.between(DateOfBirth.toLocalDate(),LocalDate.now()).getYears()<18;
    }

    @Override
    public boolean isUserExist(User user) {
        return userRepo.findByEmail(user.getEmail()).isPresent();
    }

    @Override
    public List<User> getUsers() {
        return userRepo.findAll();
    }
}
