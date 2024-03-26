package com.example.calculator.Services;

import com.example.calculator.Dto.CalculatorForm;
import com.example.calculator.Models.CalculationHistory;
import com.example.calculator.Models.User;
import com.example.calculator.Repositories.CalculatorRepository;
import com.example.calculator.Repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class CalculatorImpl implements CalculatorService {

    @Autowired
    private CalculatorRepository calculatorRepository;

    @Autowired
    private UserRepository userRepository;

    @Override
    public double calculate(CalculatorForm calculatorForm) {
       double result;
        switch (calculatorForm.getOperator()) {
            case "+":
                result = calculatorForm.getFirstNumber() + calculatorForm.getSecondNumber();
                break;
            case "-":
                result = calculatorForm.getFirstNumber() - calculatorForm.getSecondNumber();
                break;
            case "/":
                 result = calculatorForm.getFirstNumber() / calculatorForm.getSecondNumber();
                 break;
            case "x":
                 result = calculatorForm.getFirstNumber() * calculatorForm.getSecondNumber();
                 break;
            case "^2":
                 result = Math.pow(calculatorForm.getFirstNumber(), 2);
                 break;
            case "sqrt":
                result = Math.sqrt(calculatorForm.getFirstNumber());
                break;
            default:
                throw new IllegalArgumentException("Invalid operator: " + calculatorForm.getOperator());
        }

        CalculationHistory calculationHistory = CalculationHistory.builder()
                .firstNumber(calculatorForm.getFirstNumber())
                .operator(calculatorForm.getOperator())
                .secondNumber(calculatorForm.getSecondNumber())
                .result(result)
                .build();
        calculatorRepository.save(calculationHistory);

        return result;
    }
}
