package methods;

import java.util.Scanner;

public class RecursiveFibonacciDemo {
    static int fibonacci(int n){
        if (n == 1 || n == 0)
            return n;
        else
            return fibonacci(n-1)+fibonacci(n-2);
    }
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int num = scanner.nextInt();

        for(int i = 0 ; i <= num ; i++) {
            System.out.println(fibonacci(i));
        }
    }
}
