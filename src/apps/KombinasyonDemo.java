package apps;

import java.util.Scanner;

public class KombinasyonDemo {
    public static void main(String[] args) {
        int n, r; long kombinasyon, nfak = 1, rfak = 1, ffak = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("n değerini giriniz. ");
        n = scanner.nextInt();
        System.out.println("r değerini giriniz. ");
        r = scanner.nextInt();
        for (int i = 1; i <= n; i++)
            nfak = nfak * i;
        for (int j = 1; j <= r; j++)
            rfak = rfak * j;
        for (int l = 1; l <= (n - r); l++)
            ffak = ffak * l;
        kombinasyon = nfak / (rfak * ffak);
        System.out.println("Kombinasyon: " + kombinasyon);
    }
}
