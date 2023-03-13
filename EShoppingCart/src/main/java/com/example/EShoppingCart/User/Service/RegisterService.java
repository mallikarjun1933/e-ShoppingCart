package com.example.EShoppingCart.User.Service;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;

import java.sql.Date;
import java.util.List;

public interface RegisterService
{
    APIResponse createUser(User user);
    boolean isMinor(Date DateOfBirth);
    boolean isUserExist(User user);
    List<User> getUsers();
}
