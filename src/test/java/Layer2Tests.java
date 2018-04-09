import Functions.Logarithmic.LogarithmFunction;
import Functions.SystemOfFunctions;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.anyDouble;
import static org.mockito.Mockito.when;

public class Layer2Tests {
    private LogarithmFunction logarithmic;
    private TrigonomFunction trigonometric;
    private SystemOfFunctions functionSystem;

    private double x;
    private double expected;
    private double accuracy = 0.0001;

    private void mockTrigonometric() {
        trigonometric = Mockito.mock(TrigonomFunction.class);

        when(trigonometric.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.trigonomMap.get(invocation.getArgument(0)));

        functionSystem = new SystemOfFunctions(trigonometric, logarithmic);
    }

    private void mockLogarithmic() {
        logarithmic = Mockito.mock(LogarithmFunction.class);

        when(logarithmic.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.logarithmMap.get(invocation.getArgument(0)));

        functionSystem = new SystemOfFunctions(trigonometric, logarithmic);
    }

    @Test
    public void test1() {
        x = -0.1;
        expected = 8.20076;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test2() {
        x = -0.6;
        expected = 0.80787;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test3() {
        x = -1.4;
        expected = 5.71394;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test4() {
        x = -1.7;
        expected = -7.63231;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test5() {
        x = -2.5;
        expected = -0.09988;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test6() {
        x = -3.0;
        expected = 5.30002;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test7() {
        x = -3.3;
        expected = -8.78094;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test8() {
        x = -3.5;
        expected = -6.54937;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test9() {
        x = -3.7;
        expected = -11.29406;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test10() {
        x = -3.9;
        expected = 7.39122;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test11() {
        x = -4.1;
        expected = 0.34017;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test12() {
        x = -4.5;
        expected = -4.43679;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test13() {
        x = -4.9;
        expected = 5.24913;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test14() {
        x = -5.3;
        expected = 2.53838;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test15() {
        x = -5.5;
        expected = 6.67322;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test16() {
        x = -5.8;
        expected = -7.49205;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test17() {
        x = -5.9;
        expected = -6.34889;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test18() {
        x = -6.1;
        expected = -7.96246;
        mockTrigonometric();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test21() {
        x = 0.13;
        expected = -0.41809;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test22() {
        x = 0.26;
        expected = -0.04809;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test23() {
        x = 0.39;
        expected = 0.01485;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test24() {
        x = 0.71;
        expected = 0.00946;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test25() {
        x = 1.29;
        expected = 0.00936;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test26() {
        x = 1.88;
        expected = 0.07354;
        mockLogarithmic();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }
}
