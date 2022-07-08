package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.java.course2.calculator.exceptions.ZeroDivideException;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplParameterTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    //sum
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfSummation(int num1, int num2) {
        assertEquals(num1 + num2, out.doPlus(num1, num2));
    }

    //minus
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMinus(int num1, int num2) {
        assertEquals(num1 - num2, out.doMinus(num1, num2));
    }

    //Multiply
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfMultiplication(int num1, int num2) {
        assertEquals(num1 * num2, out.doMultiply(num1, num2));
    }
    
    //Divide
    @MethodSource("provideArgumentsForCalculatorTests")
    @ParameterizedTest
    public void shouldReturnCorrectResultOfDivision(int num1, int num2) {
        assertEquals(num1 / num2, out.doDivide(num1, num2));
    }

    private static Stream<Arguments> provideArgumentsForCalculatorTests() {
        return Stream.of(
                Arguments.of(ZERO, ONE),
                Arguments.of(ZERO, TWO),
                Arguments.of(ONE, ONE),
                Arguments.of(ONE, TWO),
                Arguments.of(TWO, TWO)
        );

    }
}
