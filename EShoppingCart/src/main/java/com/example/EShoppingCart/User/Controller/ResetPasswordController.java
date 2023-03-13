package com.example.EShoppingCart.User.Controller;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.Service.ResetPasswordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class ResetPasswordController {
    @Autowired
    private ResetPasswordService resetPasswordService;

    public APIResponse<User> resetPassword(@RequestBody User user, @PathVariable("password") String password)
    {
        resetPasswordService.resetPassword(user);
        return new APIResponse<>(204,"Passsword reset successfully");
    }
}
