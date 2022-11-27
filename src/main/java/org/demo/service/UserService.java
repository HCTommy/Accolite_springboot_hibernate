package org.demo.service;

import org.demo.model.LoginModel;
import org.demo.model.UserDetailsModel;
import org.demo.repository.LoginRepository;
import org.demo.repository.UserDetailsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class UserService {

    @Autowired
    private UserDetailsRepository userDetailsRepository;
    @Autowired
    private LoginRepository loginRepository;

    public List<UserDetailsModel> findAllUserDetails(){
//        return userDetailsRepository.findAllActiveUsers();
        return userDetailsRepository.findAll();
    }

    public List<UserDetailsModel> findAllActiveUserDetails(){
        return userDetailsRepository.findAllActiveUsers();
    }

    public void login(LoginModel loginModel){
        Integer id = loginModel.getId();
        String password = loginModel.getPassword();
        Optional<LoginModel> byId = loginRepository.findById(id);
        LoginModel loginModel1 = byId.get();
        if (loginModel1.getPassword().equals(password)){
            System.out.println("reach here");
            loginModel1.setStatus("active");
            loginRepository.save(loginModel1);
        }


    }





}
