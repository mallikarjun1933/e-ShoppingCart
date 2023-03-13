package com.example.EShoppingCart.User.Controller;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.SD.LoginDto;
import com.example.EShoppingCart.User.Service.AuthenticateService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users/signIn")
public class AuthController {
    @Autowired
    private AuthenticateService authenticateService;
@PostMapping("users/signin")
    public APIResponse<User> singIn(@RequestBody LoginDto loginDto)
    {
       return authenticateService.authenticate(loginDto);
    }
}
