package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class EnYakinMinMax {
    public static void main(String[] args) {
        int[] list = {65,5,-9,-42,83,13,-55,1,74,36,-23,32,8,7,-12,3,41,33};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bir sayı giriniz : ");
        int number = scanner.nextInt();
        Arrays.sort(list);

        int min = number;
        int max = number;

        for (int j : list) {
            if (j > max) {
                max = j;
                break;
            }
        }

        for(int i = list.length-1; i > 0; i--) {
            if (list[i] < min) {
                min = list[i];
                break;
            }
        }

        System.out.println("Girilen sayıdan küçük en büyük sayı : " + min);
        System.out.println("Girilen sayıdan büyük en küçük sayı : " + max);
        scanner.close();

    }
}
