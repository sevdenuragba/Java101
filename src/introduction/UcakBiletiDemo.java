package introduction;

import java.util.Scanner;

public class UcakBiletiDemo {
    public static void main(String[] args) {

        int mesafe,yas,tip;
        double normalTutar,yasIndirimi,indirimliTutar;
        Scanner inp = new Scanner(System.in);
        System.out.println("Lütfen gideceğiniz mesafeyi giriniz");
        mesafe = inp.nextInt();
        System.out.println("Lütfen yaşınızı giriniz");
        yas = inp.nextInt();
        System.out.println("Tek yön bilet için 1'i, gidiş-dönüş bileti 2'yi tuşlayınız.");
        tip = inp.nextInt();
        if (mesafe>0 && yas>0)
            switch (tip) {
                case 1:
                    if (yas < 12) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.50;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else if (12 <= yas && 24 > yas) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else if (yas > 65) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        System.out.println("Toplam tutar:" + normalTutar);
                    }
                    break;
                case 2:
                    if (yas < 12) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.50;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else if (12 <= yas && 24 > yas) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else if (yas > 65) {
                        normalTutar = mesafe * 0.10;
                        yasIndirimi = normalTutar * 0.10;
                        indirimliTutar = normalTutar - yasIndirimi;
                        System.out.println("Toplam tutar:" + indirimliTutar);
                    } else {
                        normalTutar = mesafe * 0.10;
                        System.out.println("Toplam tutar:" + normalTutar);
                    }
                    break;
                default:
                    System.out.println("Hatalı tuşlama yaptınız.");
            }
        else
            ;
    }
}
