package com.example.calculator.Services;

import com.example.calculator.Dto.UserForm;
import com.example.calculator.Models.User;
import com.example.calculator.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;


@Component
public class RegisterServiceImpl implements RegisterService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void addUser(UserForm form) {
        User user = User.builder()
                .firstname(form.getFirstname())
                .lastname(form.getLastname())
                .password(passwordEncoder.encode(form.getPassword()))
                .username(form.getUsername())
                .build();
        userRepository.save(user);

    }
}
