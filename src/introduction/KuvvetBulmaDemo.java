package introduction;

import java.util.Scanner;

public class KuvvetBulmaDemo {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz.");
        n = scanner.nextInt();

        System.out.println("Dördün kuvvetleri ");
        for(int i=1; i<n; i*=4)
            System.out.println(i + "\n");

        System.out.println("Beşin kuvvetleri ");
        for(int j=1; j<n; j*=5)
            System.out.println(j + "\n");
    }
}
