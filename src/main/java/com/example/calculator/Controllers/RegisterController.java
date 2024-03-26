package com.example.calculator.Controllers;


import com.example.calculator.Dto.UserForm;
import com.example.calculator.Services.RegisterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class RegisterController {

    @Autowired
    private RegisterService registerService;

    @GetMapping("/register")
    public String getRegisterPage() {
        return "registration_page";
    }

    @PostMapping("/register")
    public String signUp(UserForm form) {
        registerService.addUser(form);
        return "redirect:/registerPage";
    }
}
