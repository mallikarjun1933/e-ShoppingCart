package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.Service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public class IManagementService implements ManagementService
{
    @Autowired
    private UserRepo userRepo;

    @Override
    public APIResponse<User> updateManagement(User user,Integer id) {
        User us=userRepo.findById(id).orElseThrow(()->new RuntimeException());
        us.setName(user.getName());
        us.setAccount(user.getAccount());
        us.setAddress(user.getAddress());
        us.setEmail(user.getEmail());
        us.setDateOfBirth(user.getDateOfBirth());
        us.setGender(user.getGender());
        us.setPassword(user.getPassword());
        us.setRoles(user.getRoles());
        return new APIResponse<>(201,"User Management Updated");
    }

    @Override
    public APIResponse<User> deleteManagement(User user,Integer id) {
        User ud=userRepo.findById(id).orElseThrow(()->new RuntimeException());
        userRepo.delete(ud);
        return null;
    }

    @Override
    public List<User> getManageUsers() {
        return userRepo.findAll();
    }

    @Override
    public APIResponse<User> getManagementById(Integer id) {
        Optional<User> user = userRepo.findById(id);
        if (user.isPresent()) {
            return new APIResponse<>(202, "User Found");
        } else {
            return new APIResponse<>(404, "User NotFound with that id" + id);
        }

    }

    @Override
    public APIResponse<User> getUserByEmail(String email) {
        Optional<User> user = userRepo.findByEmail(email);
        if (user.isPresent()) {
            return new APIResponse<>(204, "User Found");
        } else {

            return new APIResponse<>(404, "User notfound with this email" + email);
        }
    }
}
