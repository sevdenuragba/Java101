package apps;

import java.util.Scanner;

public class MinMaxBulmaDemo {
    public static void main(String[] args) {
        int n, value, min = 0, max = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Kaç sayı gireceksiniz: ");
        n = scanner.nextInt();
        System.out.println("Lütfen 1. sayıyı giriniz: ");
        value = scanner.nextInt();
        max = value;
        min = value;

        for(int i = 1 ; i < n ; i++){
            System.out.println( (i+1) +". sayıyı giriniz: ");
            value = scanner.nextInt();
            if(value < min)
                min = value;
            if(value > max)
                max = value;
        }
        System.out.println("En küçük sayı: " + min);
        System.out.println("En büyük sayı: " + max);
    }
}
