package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.Service.AuthorizeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IAuthorizeService implements AuthorizeService {
    @Autowired
    UserRepo userRepo;

    @Override
    public boolean isUserExist(User user) {
        return false;
    }
}
