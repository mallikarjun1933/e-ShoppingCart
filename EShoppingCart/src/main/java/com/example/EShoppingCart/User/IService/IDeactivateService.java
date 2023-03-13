package com.example.EShoppingCart.User.IService;

import com.example.EShoppingCart.User.Model.Account;
import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Repsitory.UserRepo;
import com.example.EShoppingCart.User.SD.Status;
import com.example.EShoppingCart.User.Service.DeactivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IDeactivateService implements DeactivationService {
    @Autowired
    UserRepo userRepo;
    @Override
    public void deactivate(User user) {
        Account ac=user.getAccount();
        ac.getStatus(Status._Inactive);
    }

    @Override
    public void banned(User user) {
    Account Ac=user.getAccount();
    Ac.setStatus(Status._Banned);
    }
}
