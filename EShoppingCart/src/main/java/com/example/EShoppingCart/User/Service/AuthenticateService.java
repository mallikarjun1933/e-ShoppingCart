package com.example.EShoppingCart.User.Service;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.SD.LoginDto;

public interface AuthenticateService
{
APIResponse<User> authenticate(LoginDto loginDto);
}
