package apps;

import java.util.Scanner;

public class CiftSayiBulma {
    public static void main(String[] args) {
        int k , total = 0, numbers = 0;
        double average;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        k = scanner.nextInt();

        for(int i=0; i<=k; i++){
            if ((i%12 == 0) && (i != 0)){
                total += i;
                numbers++;
            }
        }average = total / numbers;
        System.out.println("3 ve 4'e tam bölünen sayıların ortalaması: " + average);
    }
}
