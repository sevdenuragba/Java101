package methods;

import java.util.Scanner;

public class RecursiveUsluSayiDemo {
        static int power(int a, int b) {
            if (b == 0) {
                return 1;
            }
            return a * power(a, (b - 1));
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Taban sayısı : ");
            int a = scanner.nextInt();
            System.out.print("Üs sayısı : ");
            int b = scanner.nextInt();
            System.out.print("Sonuç : " + power(a, b));

        }
}
