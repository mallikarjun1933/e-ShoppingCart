package com.example.EShoppingCart.User.Controller;
import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.Service.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1")
public class RegisterController
{
    @Autowired
private RegisterService registerService;
    @PostMapping("/users/signup")
    public APIResponse signUp(@RequestBody User user)
    {
       return registerService.createUser(user);
    }
}
