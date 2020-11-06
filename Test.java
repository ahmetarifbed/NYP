public class Test {
    public static void main(String[] args) {
    
        System.out.println(MyUtils.ucgenCevre(3,4,5));
        System.out.println(MyUtils.ucgenAlan(3,4,5));
        System.out.println(MyUtils.cokgenCevre(9,9,9,9,9,9,9));
        System.out.println(MyUtils.cokgenAlan(9,9,9,9,9,9,9));

        int[] sayi_dizi = {-55,-32,-25,-10,0,1,5,6,9,10,15,28,40,69,85};
        
        double[] ciktilar = MyUtils.fonksiyon(sayi_dizi);

        for (double cikti: ciktilar) {
            System.out.println(cikti);
        }
    }
}
