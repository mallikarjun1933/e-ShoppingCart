package com.example.EShoppingCart.User.Service;

import com.example.EShoppingCart.User.Model.User;

public interface DeactivationService
{
    void deactivate(User user);
    void banned(User user);
}
