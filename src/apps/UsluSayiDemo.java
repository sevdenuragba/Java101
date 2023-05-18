package apps;

import java.util.Scanner;

public class UsluSayiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n, m, us = 1;
        System.out.println("Üssü alınacak sayı: ");
        n = scanner.nextInt();
        System.out.println("Üs olacak sayı:");
        m = scanner.nextInt();
        for(int i=1; i<m; i++) {
            us *= n;
        }
        System.out.println(us);
    }
}
