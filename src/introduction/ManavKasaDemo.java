package introduction;

import java.util.Scanner;

public class ManavKasaDemo {
    public static void main(String[] args) {
        double armut = 2.14;
        double elma = 3.67;
        double domates = 1.11;
        double muz = 0.95;
        double patlıcan = 5.00;
        double toplam = 0.00;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kaç kilo armut istersiniz?");
        armut *= scanner.nextInt();
        System.out.println("Kaç kilo elma istersiniz?");
        elma *= scanner.nextInt();
        System.out.println("Kaç kilo domates istersiniz?");
        domates *= scanner.nextInt();
        System.out.println("Kaç kilo muz istersiniz?");
        muz *= scanner.nextInt();
        System.out.println("Kaç kilo patlıcan istersiniz?");
        patlıcan *= scanner.nextInt();

        toplam = armut + elma + domates + muz + patlıcan;
        System.out.println("Toplam tutar: " + toplam);
    }
}
