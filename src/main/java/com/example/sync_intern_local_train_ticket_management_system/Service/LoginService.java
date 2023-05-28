package com.example.sync_intern_local_train_ticket_management_system.Service;

import com.example.sync_intern_local_train_ticket_management_system.Entity.UserLogin;
import com.example.sync_intern_local_train_ticket_management_system.Entity.UserRegistration;
import com.example.sync_intern_local_train_ticket_management_system.Repository.UserRepository;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service

public class LoginService {
    private final UserRepository userRepository;
    private PasswordEncoder bycrypt;

    public LoginService(UserRepository userRepository, PasswordEncoder bycrypt) {
        this.userRepository = userRepository;
        this.bycrypt = bycrypt;
    }

    public UserRegistration login(UserLogin userLogin) {
        System.out.println(userRepository.findById(Long.parseLong(userLogin.getUsername().trim())));
        UserRegistration byUsername = userRepository.findById(Long.parseLong(userLogin.getUsername().trim()));
        if (byUsername == null) {

            return null;
        } else if (bycrypt.matches(userLogin.getPassword(), byUsername.getPassword())) {

            return byUsername;
        }
        System.out.println("Out of the loop");
        System.out.println(byUsername);
        return null;
    }

    public void Register(UserRegistration userRegistration) {
        userRegistration.setPassword(bycrypt.encode(userRegistration.getPassword()));
        UserRegistration save = userRepository.save(userRegistration);

    }
}
