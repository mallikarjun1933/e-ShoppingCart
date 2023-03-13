package com.example.EShoppingCart.User.Service;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;

import java.util.List;

public interface ManagementService
{
    APIResponse<User> updateManagement(User user,Integer id);
    APIResponse<User> deleteManagement(User user,Integer id);
    List<User> getManageUsers();
    APIResponse<User> getManagementById(Integer id);
    APIResponse<User> getUserByEmail(String email);
}
