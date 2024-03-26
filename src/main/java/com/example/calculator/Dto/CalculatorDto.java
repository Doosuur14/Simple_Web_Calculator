package com.example.calculator.Dto;


import com.example.calculator.Models.CalculationHistory;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

public class CalculatorDto {
    private Long id;
    private Double firstNumber;
    private String operator;
    private Double secondNumber;

    public static CalculatorDto from(CalculationHistory calculator) {
        return CalculatorDto.builder()
                .id(calculator.getId())
                .firstNumber(calculator.getFirstNumber())
                .operator(calculator.getOperator())
                .secondNumber(calculator.getSecondNumber())
                .build();
    }

    public static List<CalculatorDto> calculationHistoryList(List<CalculationHistory> calculations) {
        return calculations.stream()
                .map(CalculatorDto::from)
                .collect(Collectors.toList());

    }

}
