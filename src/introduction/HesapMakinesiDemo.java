package introduction;

import java.util.Scanner;

public class HesapMakinesiDemo {
    public static void main(String[] args) {

        int n1,n2,select;
        Scanner scanner =new Scanner(System.in);
        System.out.println("1. sayıyı giriniz.");
        n1 = scanner.nextInt();
        System.out.println("2. sayıyı giriniz.");
        n2 = scanner.nextInt();
        System.out.println("Yapmak istediğniz işlemi seçiniz: \n" + "1-Toplama \n2-Çıkarma \n3-Çarpma \n4-Bölme");
        select= scanner.nextInt();
        switch (select) {
            case 1:
                System.out.println("Toplama sonucu: "+ (n1+n2));
                break;
            case 2:
                System.out.println("Çıkarma sonucu:"+ (n1-n2));
                break;
            case 3:
                System.out.println("Çarpma sonucu:"+ (n1*n2));
                break;
            case 4:
                System.out.println("Bölme sonucu:"+ (n1/n2));
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Lütfen tekrar deneyin");
                break;
        }
    }
}
