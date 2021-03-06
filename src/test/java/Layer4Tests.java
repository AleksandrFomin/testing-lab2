import Functions.Logarithmic.*;
import Functions.SystemOfFunctions;
import Functions.Trigonometric.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

public class Layer4Tests {
    private LogarithmFunction logarithmic;
    private TrigonomFunction trigonometric;
    private SystemOfFunctions functionSystem;
    private Cos cos;
    private Sin sin;
    private Cot cot;
    private Tan tan;
    private Ln ln;
    private Log3 log3;
    private Log5 log5;
    private Log10 log10;

    private double x;
    private double expected;
    private double accuracy = 0.01;

    private void mockCosSin() {
        cos = Mockito.mock(Cos.class);
        sin = Mockito.mock(Sin.class);
        cot = new Cot(sin, cos);
        tan = new Tan(sin, cos);

        when(cos.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.cosMap.get(invocation.getArgument(0)));

        when(sin.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.sinMap.get(invocation.getArgument(0)));

//        when(cos.compute(anyDouble(), anyDouble())).
//                thenAnswer(invocation -> Math.cos(invocation.getArgument(0)));
//
//        when(sin.compute(anyDouble(), anyDouble())).
//                thenAnswer(invocation -> Math.sin(invocation.getArgument(0)));

        trigonometric = new TrigonomFunction(cos, sin, cot, tan);
        functionSystem = new SystemOfFunctions(trigonometric, logarithmic);
    }

    private void mockLn() {
        ln = Mockito.mock(Ln.class);
        log3 = new Log3(ln);
        log5 = new Log5(ln);
        log10 = new Log10(ln);

        when(ln.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.lnMap.get(invocation.getArgument(0)));

        logarithmic = new LogarithmFunction(ln, log3, log5, log10);
        functionSystem = new SystemOfFunctions(trigonometric, logarithmic);
    }

    @Test
    public void test1() {
        x = -0.1;
        expected = 8.20076;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test2() {
        x = -0.6;
        expected = 0.80787;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test3() {
        x = -1.4;
        expected = 5.71394;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test4() {
        x = -1.7;
        expected = -7.63231;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test5() {
        x = -2.5;
        expected = -0.09988;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test6() {
        x = -3.0;
        expected = 5.30002;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test7() {
        x = -3.3;
        expected = -8.78094;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test8() {
        x = -3.5;
        expected = -6.54937;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test9() {
        x = -3.7;
        expected = -11.29406;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test10() {
        x = -3.9;
        expected = 7.39122;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test11() {
        x = -4.1;
        expected = 0.34017;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test12() {
        x = -4.5;
        expected = -4.43679;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test13() {
        x = -4.9;
        expected = 5.24913;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test14() {
        x = -5.3;
        expected = 2.53838;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test15() {
        x = -5.5;
        expected = 6.67322;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test16() {
        x = -5.8;
        expected = -7.49205;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test17() {
        x = -5.9;
        expected = -6.34889;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test18() {
        x = -6.1;
        expected = -7.96246;
        mockCosSin();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test21() {
        x = 0.13;
        expected = -0.41809;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test22() {
        x = 0.26;
        expected = -0.04809;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test23() {
        x = 0.39;
        expected = 0.01485;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test24() {
        x = 0.71;
        expected = 0.00946;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test25() {
        x = 1.29;
        expected = 0.00936;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test26() {
        x = 1.88;
        expected = 0.07354;
        mockLn();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }
}
