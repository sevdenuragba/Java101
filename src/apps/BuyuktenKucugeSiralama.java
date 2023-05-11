package apps;

import java.util.Scanner;

public class BuyuktenKucugeSiralama {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a, b, c;

        System.out.print("İlk sayıyı giriniz.");
        a = scanner.nextInt();
        System.out.print("İkinci sayıyı giriniz.");
        b = scanner.nextInt();
        System.out.print("Üçüncü sayıyı giriniz.");
        c = scanner.nextInt();

        if (a > b && a > c && b > c) {
            System.out.println("a>b>c");
        } else if (a > b && c > b) {
            System.out.println("a>c>b");
        } else if (b > a && a > c) {
            System.out.println("b>a>c");
        } else if (c > a && a > b) {
            System.out.println("c>a>b");
        } else if (b > c && c > a) {
            System.out.println("b>c>a");
        } else {
            System.out.println("c>b>a");
        }

    }
}
