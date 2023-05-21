package introduction;

import java.util.Scanner;

public class EbobEkokDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int ebob = 1;
        System.out.println("Birinci sayıyı giriniz: ");
        int n1 = scanner.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int n2 = scanner.nextInt();

        if (n1 < n2) {
            int i = n1;
            while (i >= 1) {
                if ((n1 % i == 0) && (n2 % i == 0)) {
                    ebob = i;
                    System.out.println("Ebob: " + ebob);
                    break;
                }
                i--;
            }
        } else {
            int k = n2;
            while (k >= 1) {
                if ((n1 % k == 0) && (n2 % k == 0)) {

                    ebob = k;
                    System.out.println("Ebob: " + ebob);
                    break;
                }
                k--;
            }
        }
        System.out.println("Ekok: " + ((n1 * n2) / ebob));
    }
}
