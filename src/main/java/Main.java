import Functions.SystemOfFunctions;
import Functions.Trigonometric.Sin;

public class Main {
    public static void main(String[] args) {
        Sin sin = new Sin();
        System.out.println(sin.compute(-3.0, 0.001));
        System.out.println(Math.sin(-3.0));
    }
}
