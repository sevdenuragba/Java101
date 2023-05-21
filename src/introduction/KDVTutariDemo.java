package introduction;
import java.util.Scanner;

public class KDVTutariDemo {
    public static void main(String[] args) {
    Scanner inp = new Scanner(System.in);
    System.out.println("Toplam tutarı giriniz.");
    double tutar = inp.nextDouble();
    double kdvTutar;
    if (tutar > 0.0 && tutar < 1000.0) {
        kdvTutar = tutar * 0.18;
        System.out.println("KDV tutarı:" + kdvTutar);
    } else if (tutar > 1000.0) {
        kdvTutar = tutar * 0.08;
        System.out.println("KDV tutarı:" + kdvTutar);
    } else {
        System.out.println("Lütfen tutarı doğru formatta giriniz");
    }

}
}
