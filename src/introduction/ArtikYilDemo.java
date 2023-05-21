package introduction;

import java.util.Scanner;

public class ArtikYilDemo {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Yıl giriniz: ");
        year = scanner.nextInt();

        if(year % 4 == 0 && year % 100!=0 || year % 400==0){
            System.out.print(year + " bir artık yıldır.");
        }
        else{
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
