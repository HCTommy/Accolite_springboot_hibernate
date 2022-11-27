package org.demo.controller;

import org.demo.model.LoginModel;
import org.demo.model.UserDetailsModel;
import org.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/allUsers")
    public List<UserDetailsModel> allUserDetails(){
        return userService.findAllUserDetails();
    }

    @GetMapping("/activeUsers")
    public List<UserDetailsModel> AllActiveUserDetails(){
        return userService.findAllActiveUserDetails();
    }

    @GetMapping("/login")
    public void login(LoginModel loginModel){
//        System.out.println(loginModel);

        userService.login(loginModel);
    }
}
