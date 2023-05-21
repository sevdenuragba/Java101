package introduction;

import java.util.Scanner;

public class MukemmelSayiDemo {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Bir sayı giriniz: ");
        int n = scanner.nextInt();
        int toplam = 0;
        if(n!=1){
            for (int i = 1 ; i < n ; i++){
                if(n % i == 0){
                    toplam += i;
                }
            }
        }else{
            System.out.println(n + " bir mükemmel sayı değildir.");
        }

        if(n == toplam){
            System.out.println(n + " bir mükemmel sayıdır.");
        }else{
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
    }
}
