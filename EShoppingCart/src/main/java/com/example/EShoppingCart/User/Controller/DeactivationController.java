package com.example.EShoppingCart.User.Controller;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.Service.DeactivationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class DeactivationController {
    @Autowired
    DeactivationService deactivationService;
    @DeleteMapping("/users/{inactivate}")
    public void deactivateAccount(@RequestBody User user)
    {
        deactivationService.deactivate(user);
    }

    @DeleteMapping("/users/{banned}")
    public void bannedAccount(@RequestBody User user)
    {
        deactivationService.banned(user);
    }
}
