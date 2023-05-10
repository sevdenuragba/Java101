package apps;

import java.util.Scanner;

public class DaireDilimiAlanDemo {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        double r, mAci, alan;

        System.out.print("Dairenin yarıçapını giriniz.");
        r = inp.nextDouble();

        System.out.print("Dairenin merkez açısını giriniz.");
        mAci = inp.nextDouble();

        alan = (Math.PI * (r * r) * mAci) / 360;
        System.out.print("Daire diliminin alani: " + alan);
    }
}
