package methods;

import java.util.Scanner;

public class DesenMetotDemo {

    public static void patternMethod(int num, int temp, boolean a) {

        if(num > 0 && a) {
            System.out.print(num + " ");
            num -= 5;
            patternMethod(num, temp,true);
        }
        else if(num == 0 || num < 0) {
            System.out.print(num + " ");
            num += 5;
            patternMethod(num, temp,false);
        }

        else if(num <= temp) {
            System.out.print(num + " ");
            num += 5;
            patternMethod(num,temp,false);
        }
    }

    public static void main(String[] args) {
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Desen oluşturmak için bir n sayısı giriniz : ");
        num = scanner.nextInt();

        patternMethod(num,num,true);
    }

}