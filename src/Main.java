import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int matematik, fizik, kimya, turkce, tarih, muzik;
        Scanner inp = new Scanner(System.in);
        System.out.println("Matematik notunuzu giriniz.");
        matematik = inp.nextInt();
        System.out.println("Fizik notunuzu giriniz.");
        fizik = inp.nextInt();
        System.out.println("Kimya notunuzu giriniz.");
        kimya = inp.nextInt();
        System.out.println("Türkçe notunuzu giriniz.");
        turkce = inp.nextInt();
        System.out.println("Tarih notunuzu giriniz.");
        tarih = inp.nextInt();
        System.out.println("Müzik notunuzu giriniz.");
        muzik = inp.nextInt();

        int sonuc = (matematik + fizik + kimya + turkce + tarih + muzik) / 6;
        System.out.println("Not ortalamanız:" + sonuc);
        String durum = sonuc >= 60 ? "Sınıfı geçtiniz." : "Sınıfta kaldınız.";
        System.out.println(durum);
    }
}