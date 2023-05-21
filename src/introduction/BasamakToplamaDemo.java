package introduction;

import java.util.Scanner;

public class BasamakToplamaDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, bas, result = 0;
        System.out.print("Bir sayı giriniz.");
        n = scanner.nextInt();
        while (n != 0) {
            bas = n % 10;
            result += bas;
            n /= 10;
        }
        System.out.print("Sayının basamakları toplamı: " + result);
    }
}
