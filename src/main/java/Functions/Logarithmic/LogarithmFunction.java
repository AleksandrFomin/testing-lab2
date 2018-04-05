package Functions.Logarithmic;

import Functions.Computable;

public class LogarithmFunction implements Computable {
    private Log3 log3;
    private Log10 log10;
    private Ln ln;
    private Log5 log5;

    public LogarithmFunction(Ln ln, Log3 log3, Log5 log5, Log10 log10){
        this.ln = ln;
        this.log3 = log3;
        this.log5 = log5;
        this.log10 = log10;
    }

    @Override
    public double compute(double x, double accuracy) {
        return calculateExpression(x, accuracy);
    }

    private double calculateExpression(double x, double a) {
        return (((((log3.compute(x, a) * log10.compute(x, a)) +
                log10.compute(x, a)) / ln.compute(x, a)) *
                log5.compute(x, a)) * log10.compute(x, a));
    }
}
