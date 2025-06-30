package com.bmi.calculator.bmiCalculator;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class BMICalculatorTest {
    @Test
    public void testBMI() {
        double weight = 70;
        double height = 1.75;
        double expected = weight / (height * height);
        assertEquals(expected, 22.8571428571, 0.01);
    }
}
