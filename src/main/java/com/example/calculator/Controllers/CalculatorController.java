package com.example.calculator.Controllers;


import com.example.calculator.Dto.CalculatorForm;
import com.example.calculator.Security.Details.UserDetailsImpl;
import com.example.calculator.Services.CalculatorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class CalculatorController {

    @Autowired
    private CalculatorService calculatorService;

    @GetMapping("/calculate")
     public  String showCalculator() {
        return "calculator_layout";
    }

    @PostMapping("/calculate")
    public String calculate( CalculatorForm calculatorForm, Model model ) {
        double result = calculatorService.calculate(calculatorForm);
        model.addAttribute("result", result);
        return "calculator_layout";
    }
}
