package Functions;

import Functions.Logarithmic.LogarithmFunction;
import Functions.Trigonometric.TrigonomFunction;

public class SystemOfFunctions implements Computable {

    private TrigonomFunction trigonomFunction;
    private LogarithmFunction logarithmFunction;

    public SystemOfFunctions(TrigonomFunction trigonomFunction,
                             LogarithmFunction logarithmFunction) {
        this.trigonomFunction = trigonomFunction;
        this.logarithmFunction = logarithmFunction;
    }

    @Override
    public double compute(double x, double accuracy) {
        return calculateSystem(x, accuracy);
    }

    private double calculateSystem(double x, double accuracy) {
        if (x <= 0) {
            return trigonomFunction.compute(x, accuracy);
        } else {
            return logarithmFunction.compute(x, accuracy);
        }
    }
}
