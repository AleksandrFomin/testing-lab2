import Functions.SystemOfFunctions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.mockito.ArgumentMatchers.anyDouble;
import static org.mockito.Mockito.when;

public class Layer1Tests {
    private SystemOfFunctions functionSystem;

    private double x;
    private double expected;
    private double accuracy = 0.0001;

    private void mockSystem() {
        functionSystem = Mockito.mock(SystemOfFunctions.class);

        when(functionSystem.compute(anyDouble(), anyDouble())).
                thenAnswer(invocation -> Tables.systemMap.get(invocation.getArgument(0)));

    }

    @Test
    public void test1() {
        x = -0.1;
        expected = 8.20076;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test2() {
        x = -0.6;
        expected = 0.80787;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test3() {
        x = -1.4;
        expected = 5.71394;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test4() {
        x = -1.7;
        expected = -7.63231;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test5() {
        x = -2.5;
        expected = -0.09988;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test6() {
        x = -3.0;
        expected = 5.30002;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test7() {
        x = -3.3;
        expected = -8.78094;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test8() {
        x = -3.5;
        expected = -6.54937;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test9() {
        x = -3.7;
        expected = -11.29406;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test10() {
        x = -3.9;
        expected = 7.39122;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test11() {
        x = -4.1;
        expected = 0.34017;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test12() {
        x = -4.5;
        expected = -4.43679;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test13() {
        x = -4.9;
        expected = 5.24913;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test14() {
        x = -5.3;
        expected = 2.53838;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test15() {
        x = -5.5;
        expected = 6.67322;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test16() {
        x = -5.8;
        expected = -7.49205;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test17() {
        x = -5.9;
        expected = -6.34889;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test18() {
        x = -6.1;
        expected = -7.96246;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test21() {
        x = 0.13;
        expected = -0.41809;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test22() {
        x = 0.26;
        expected = -0.04809;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test23() {
        x = 0.39;
        expected = 0.01485;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test24() {
        x = 0.71;
        expected = 0.00946;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test25() {
        x = 1.29;
        expected = 0.00936;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }

    @Test
    public void test26() {
        x = 1.88;
        expected = 0.07354;
        mockSystem();
        Assertions.assertTrue(Math.abs(functionSystem.compute(x, accuracy) - expected) < accuracy);
    }
}
