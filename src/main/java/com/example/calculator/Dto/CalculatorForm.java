package com.example.calculator.Dto;


import com.example.calculator.Models.CalculationHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CalculatorForm {
    private Double firstNumber;
    private String operator;
    private Double secondNumber;
}
