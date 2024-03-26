package com.example.calculator.Repositories;

import com.example.calculator.Models.CalculationHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CalculatorRepository extends JpaRepository<CalculationHistory, Long> {
}
