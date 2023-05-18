package apps;

import java.util.Scanner;

public class CiftDördünKatı {
    public static void main(String[] args) {

        int n;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        do {
            System.out.println("Bir sayı giriniz.");
            n = scanner.nextInt();
            if (n % 4 == 0) {
                toplam += n;
            }
        }
        while (n%2==0);
        System.out.println("Toplam = "+toplam);
    }
}
