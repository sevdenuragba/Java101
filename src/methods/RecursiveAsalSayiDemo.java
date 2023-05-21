package methods;

import java.util.Scanner;

public class RecursiveAsalSayiDemo {
    static void recursivePrime() {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayıyı giriniz: ");
        int a = scanner.nextInt();

        int n = 0;

        for (int i = 2; i < a; i++) {
            if (a % i == 0) {
                n++;
            }
        }
        if (n == 0)
            System.out.println(a + " sayısı asal sayıdır.");
        else
            System.out.println(a + " sayısı asal sayı değildir.");
        recursivePrime();
    }
    public static void main(String[] args) {
        recursivePrime();
    }

}
