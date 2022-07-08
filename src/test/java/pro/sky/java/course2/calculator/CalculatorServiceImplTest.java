package pro.sky.java.course2.calculator;

import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculator.exceptions.ZeroDivideException;
import pro.sky.java.course2.calculator.service.CalculatorServiceImpl;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static pro.sky.java.course2.calculator.CalculatorServiceImplTestConstants.*;

public class CalculatorServiceImplTest {
    private final CalculatorServiceImpl out = new CalculatorServiceImpl();

    //sum
    @Test
    public void shouldReturn3WhenSum1And2() {
        assertEquals(THREE, out.doPlus(ONE, TWO));
    }

    @Test
    public void shouldReturn2WhenSum0And2() {
        assertEquals(TWO, out.doPlus(ZERO, TWO));
    }

    //minus
    @Test
    public void shouldReturn0WhenMinus2And2() {
        assertEquals(ZERO, out.doMinus(TWO, TWO));
    }

    @Test
    public void shouldReturn1WhenMinus2And1() {
        assertEquals(ONE, out.doMinus(TWO, ONE));
    }

    //Multiply
    @Test
    public void shouldReturn1WhenMultiply1And1() {
        assertEquals(ONE, out.doMultiply(ONE, ONE));
    }

    @Test
    public void shouldReturn2WhenMultiply2And1() {
        assertEquals(TWO, out.doMultiply(TWO, ONE));
    }

    //Divide
    @Test
    public void shouldReturn1WhenDivide2And2() {
        assertEquals(ONE, out.doDivide(TWO, TWO));
    }

    @Test
    public void shouldReturn2WhenDivide2And1() {
        assertEquals(TWO, out.doDivide(TWO, ONE));
    }

    @Test
    public void shouldThrowZeroDividerExceptionWhenDivideAnyNumAnd0() {
        assertThrows(ZeroDivideException.class, () -> out.doDivide(TWO, ZERO));
    }
}
