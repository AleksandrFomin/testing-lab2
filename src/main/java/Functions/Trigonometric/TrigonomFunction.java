package Functions.Trigonometric;

import Functions.Computable;

public class TrigonomFunction implements Computable {
    private Cos cos;
    private Sin sin;
    private Cot cot;
    private Tan tan;

    public TrigonomFunction(Cos cos, Sin sin, Cot cot, Tan tan){
        this.cos=cos;
        this.sin=sin;
        this.cot=cot;
        this.tan=tan;
    }

    @Override
    public double compute(double x, double accuracy) {
        return calculateExpression(x, accuracy);
    }

    private double calculateExpression(double x, double a) {
        return (((((cos.compute(x, a) + cot.compute(x, a)) / tan.compute(x, a))
                / (tan.compute(x, a) - cos.compute(x, a))) * tan.compute(x, a)) +
                sin.compute(x, a) / cot.compute(x, a));
    }
}
