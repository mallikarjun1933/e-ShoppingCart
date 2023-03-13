package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.SD.LoginDto;
import com.example.EShoppingCart.User.Service.AuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class IAuthenticateService implements AuthenticateService {
    @Autowired
    private UserRepo userRepo;

    @Override
    public APIResponse<User> authenticate(LoginDto loginDto) {
        Optional<User> user=userRepo.findByEmailAndPassword(loginDto.getUserName(),loginDto.getPassword());
        if(user.isPresent())
        {
            return new APIResponse<>(200,"User Authenticated");
        }else {
            return new APIResponse<>(401,"User not Authenticated");
        }
    }

}
