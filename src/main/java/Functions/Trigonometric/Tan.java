package Functions.Trigonometric;

import Functions.Computable;

public class Tan implements Computable {

    private Sin sin;
    private Cos cos;

    public Tan(Sin sin, Cos cos) {
        this.sin = sin;
        this.cos = cos;
    }

    @Override
    public double compute(double x, double accuracy) {
        return (sin.compute(x, accuracy)) / (cos.compute(x, accuracy));
    }
}
