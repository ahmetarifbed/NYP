public class MyUtils {
    public static float ucgenCevre(float a,float b, float c) {
        return a+b+c;
    }

    public static float ucgenAlan(float a,float b, float c) {
        float u = MyUtils.ucgenCevre(a,b,c) / 2;
        return (float) Math.sqrt(u*(u-a)*(u-b)*(u-c));
    }

    public static float cokgenCevre(float ... kenar) {
        float cevre = 0;
        for (float i:
                kenar) {
            cevre += i;
        }
        return cevre;
    }

    public static float cokgenAlan(float ... kenar) {
        return (float) (0.25 * ( kenar.length * (float)Math.pow(kenar[0], 2) *
                (1/Math.tan(Math.PI/kenar.length)) ));
    }

    public static double[] fonksiyon(int[] sayilar) {
        double[] output = new double[sayilar.length];
        
        int i = 0;
        
        for (double x: sayilar) {
            x = 3 * Math.pow(x, 2) - 2*Math.pow(Math.E, x) + Math.sqrt(x);
            sonuc[i] = 1 / (1 + Math.pow(Math.E, x));
            i++;
        }
        
        return output;
    }
}
