import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        double km,azami = 20 ,startPrice = 10 ;

        Scanner inp = new Scanner(System.in);
        System.out.print("Gidilecek Mesafe (km) :...");
        km = inp.nextDouble();
        float tutar = (float) (km * 2.2);
        tutar += startPrice;
        tutar = tutar <= azami ? (float) azami : tutar;
        System.out.println("Taksimetre Tutarı: " + tutar + " TL" );


    }
}