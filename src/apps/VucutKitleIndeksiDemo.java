package apps;

import java.util.Scanner;

public class VucutKitleIndeksiDemo {
    public static void main(String[] args) {
        double boy,kilo,indeks;
        Scanner inp = new Scanner(System.in);
        System.out.println("Boyunuzu m cinsinden giriniz.(Örn. 1,75)");
        boy = inp.nextDouble();
        System.out.println("Kilonuzu kg cinsinden giriniz.(Örn. 65)");
        kilo = inp.nextDouble();
        indeks = kilo / (boy * boy);
        System.out.println("Vücut kitle indeksiniz:" + indeks);

    }
}
