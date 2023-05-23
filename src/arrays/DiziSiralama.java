package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class DiziSiralama {
    public static void main(String[] args) {
        int temp;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Dizinin boyutunu giriniz : ");
        int n = scanner.nextInt();
        int [] list = new int[n];

        for(int i = 0 ; i < n ; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz : ");
            list[i] = scanner.nextInt();
        }

        for (int j = 0 ; j < n - 1 ; j++){
            for (int k = 0 ; k < n - j - 1 ; k++){
                if (list[k] > list[k+1]){
                    temp = list[k];
                    list[k] = list[k+1];
                    list[k+1] = temp;
                }
                System.out.println(Arrays.toString(list));
            }
        }
        System.out.println("Sıralanmış dizi : " + Arrays.toString(list));
    }
}
