import java.util.HashMap;
import java.util.Map;

public class Tables {
    public final static Map<Double,Double> trigonomMap = new HashMap<>();
    public final static Map<Double,Double> logarithmMap = new HashMap<>();
    public final static Map<Double,Double> cosMap = new HashMap<>();
    public final static Map<Double,Double> sinMap = new HashMap<>();
    public final static Map<Double,Double> tanMap = new HashMap<>();
    public final static Map<Double,Double> cotMap = new HashMap<>();

    static {
        trigonomMap.put(-0.1,8.20076);
        trigonomMap.put(-0.6,0.80787);
        trigonomMap.put(-1.4,5.71394);
        trigonomMap.put(-1.7,-7.63231);
        trigonomMap.put(-2.5,-0.09988);
        trigonomMap.put(-3.0,5.30002);
        trigonomMap.put(-3.3,-8.78094);
        trigonomMap.put(-3.5,-6.54937);
        trigonomMap.put(-3.7,-11.29406);
        trigonomMap.put(-3.9,7.39122);
        trigonomMap.put(-4.1,0.34017);
        trigonomMap.put(-4.5,-4.43679);
        trigonomMap.put(-4.9,5.24913);
        trigonomMap.put(-5.3,2.53838);
        trigonomMap.put(-5.5,6.67322);
        trigonomMap.put(-5.8,-7.49205);
        trigonomMap.put(-5.9,-6.34889);
        trigonomMap.put(-6.1,-7.96246);

        logarithmMap.put(0.13,-0.41809);
        logarithmMap.put(0.26,-0.04809);
        logarithmMap.put(0.39,0.01485);
        logarithmMap.put(0.71,0.00946);
        logarithmMap.put(1.29,0.00936);
        logarithmMap.put(1.88,0.07354);

        cosMap.put(-0.1,0.9950);
        cosMap.put(-0.6,0.8253);
        cosMap.put(-1.4,0.1700);
        cosMap.put(-1.7,-0.1288);
        cosMap.put(-2.5,-0.8011);
        cosMap.put(-3.0,-0.9900);
        cosMap.put(-3.3,-0.9875);
        cosMap.put(-3.5,-0.9365);
        cosMap.put(-3.7,-0.8481);
        cosMap.put(-3.9,-0.7259);
        cosMap.put(-4.1,-0.5748);
        cosMap.put(-4.5,-0.2108);
        cosMap.put(-4.9,0.1865);
        cosMap.put(-5.3,0.5544);
        cosMap.put(-5.5,0.7087);
        cosMap.put(-5.8,0.8855);
        cosMap.put(-5.9,0.9275);
        cosMap.put(-6.1,0.9833);

        sinMap.put(-0.1,-0.0998);
        sinMap.put(-0.6,-0.5646);
        sinMap.put(-1.4,-0.9854);
        sinMap.put(-1.7,-0.9917);
        sinMap.put(-2.5,-0.5985);
        sinMap.put(-3.0,-0.1411);
        sinMap.put(-3.3,0.1577);
        sinMap.put(-3.5,0.3508);
        sinMap.put(-3.7,0.5298);
        sinMap.put(-3.9,0.6878);
        sinMap.put(-4.1,0.8183);
        sinMap.put(-4.5,0.9775);
        sinMap.put(-4.9,0.9825);
        sinMap.put(-5.3,0.8323);
        sinMap.put(-5.5,0.7055);
        sinMap.put(-5.8,0.4646);
        sinMap.put(-5.9,0.3739);
        sinMap.put(-6.1,0.1822);

        tanMap.put(-0.1,-0.1003);
        tanMap.put(-0.6,-0.6841);
        tanMap.put(-1.4,-5.7979);
        tanMap.put(-1.7,7.6966);
        tanMap.put(-2.5,0.7470);
        tanMap.put(-3.0,0.1425);
        tanMap.put(-3.3,-0.1597);
        tanMap.put(-3.5,-0.3746);
        tanMap.put(-3.7,-0.6247);
        tanMap.put(-3.9,-0.9474);
        tanMap.put(-4.1,-1.4235);
        tanMap.put(-4.5,-4.6373);
        tanMap.put(-4.9,5.2675);
        tanMap.put(-5.3,1.5013);
        tanMap.put(-5.5,0.9956);
        tanMap.put(-5.8,0.5247);
        tanMap.put(-5.9,0.4031);
        tanMap.put(-6.1,0.1853);

        cotMap.put(-0.1,-9.9666);
        cotMap.put(-0.6,-1.4617);
        cotMap.put(-1.4,-0.1725);
        cotMap.put(-1.7,0.1299);
        cotMap.put(-2.5,1.3386);
        cotMap.put(-3.0,7.0153);
        cotMap.put(-3.3,-6.2599);
        cotMap.put(-3.5,-2.6696);
        cotMap.put(-3.7,-1.6007);
        cotMap.put(-3.9,-1.0555);
        cotMap.put(-4.1,-0.7025);
        cotMap.put(-4.5,-0.2156);
        cotMap.put(-4.9,0.1898);
        cotMap.put(-5.3,0.6661);
        cotMap.put(-5.5,1.0044);
        cotMap.put(-5.8,1.9060);
        cotMap.put(-5.9,2.4807);
        cotMap.put(-6.1,5.3978);
    }
}


//(((((ln(x)/ln(3) * ln(x)/ln(10)) + ln(x)/ln(10)) / ln(x)) * ln(x)/ln(5)) * ln(x)/ln(10))