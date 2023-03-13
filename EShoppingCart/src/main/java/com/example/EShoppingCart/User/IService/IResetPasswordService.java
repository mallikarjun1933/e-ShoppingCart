package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.Service.ResetPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IResetPasswordService implements ResetPasswordService {
    @Autowired
    private UserRepo userRepo;
    @Override
    public String resetPassword(User user) {
        return null;
    }
}
