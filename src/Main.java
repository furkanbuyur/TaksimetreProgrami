import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double km,azami ;
        azami = 20;
        System.out.print("Gidilecek Mesafe (km) :...");
        km = inp.nextDouble();
        float tutar = (float) (km * 2.2);
        boolean cnd = (km * 2.2) <= azami ;
        tutar = cnd ? (float) azami : tutar;
        System.out.println("Taksimetre Tutarı: " + tutar + " TL" );


    }
}