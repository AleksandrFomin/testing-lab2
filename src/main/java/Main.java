import Functions.CSVLog;
import Functions.Trigonometric.*;

public class Main {
    public static void main(String[] args) {
        Sin sin = new Sin();
        Cos cos = new Cos(sin);
        CSVLog.logModuleToCSV(cos, -10, 10, 0.5, 0.001);
    }
}
