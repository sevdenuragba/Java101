package introduction;

import java.util.Scanner;

public class TersUcgenDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz:");
        int n = scanner.nextInt();
        int i, j;

        for (i = 1; i <= n; i++) {
            for (j = n; j >= i; j--) {
                System.out.print("*");
            }
            System.out.println("");
        }

    }
}