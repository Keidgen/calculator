package pro.sky.java.course2.calculator.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculator.exceptions.ZeroDivideException;

@Service
public class CalculatorServiceImpl implements CalculatorService {
    @Override
    public Integer doPlus(Integer num1, Integer num2) {
        return num1 + num2;
    }
    @Override
    public Integer doMinus(Integer num1, Integer num2) {
        return num1 - num2;
    }
    @Override
    public Integer doMultiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer doDivide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }

}
