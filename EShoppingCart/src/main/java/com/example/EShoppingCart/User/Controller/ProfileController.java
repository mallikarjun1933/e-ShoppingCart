package com.example.EShoppingCart.User.Controller;

import com.example.EShoppingCart.User.Model.User;
import com.example.EShoppingCart.User.SD.APIResponse;
import com.example.EShoppingCart.User.Service.ManagementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class ProfileController
{
    @Autowired
    private ManagementService managementService;
    @GetMapping("/users")
    public List<User> getProfileUsers()
    {
        return managementService.getManageUsers();
    }
   @GetMapping("users/{id}")
    public APIResponse<User> getProfileUser(@PathVariable("id") Integer id)
    {
        return  managementService.getManagementById(id);
    }
  @GetMapping("users/{email}")
    public APIResponse<User> getProfileUserByEmail(@PathVariable("email") String email)
    {
        return managementService.getUserByEmail(email);
    }
}
