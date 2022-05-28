package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public String doPlus(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int sum = number1 + number2;
        return num1 + " + " + num2 + " = " + sum;
    }
    @Override
    public String doMinus(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int minus = number1 - number2;
        return num1 + " - " + num2 + " = " + minus;
    }
    @Override
    public String doMultiply(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        int multiply = number1 * number2;
        return num1 + " * " + num2 + " = " + multiply;
    }

    @Override
    public String doDivide(String num1, String num2) {
        int number1 = Integer.parseInt(num1);
        int number2 = Integer.parseInt(num2);
        if (number2 == 0) {
            return "Ошибка! Делить на ноль нельзя!";
        }
        int divide = number1 / number2;
        return num1 + " / " + num2 + " = " + divide;
    }

}
