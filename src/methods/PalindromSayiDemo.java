package methods;
import java.util.Scanner;
public class PalindromSayiDemo {
    static boolean isPalindrom(int num) {
        int temp = num, reverseNumber = 0, lastNumber;
        while (temp != 0) {
            lastNumber = temp % 10;
            reverseNumber = (reverseNumber * 10) + lastNumber;
            temp /= 10;
        }
        if (num == reverseNumber) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Palindrom olup olmadığını öğrenmek için bir sayı giriniz.");
        int number = scanner.nextInt();
        if (isPalindrom(number) == true)
            System.out.println(number + " bir palindrom sayıdır.");
        else
            System.out.println(number + " bir palindrom sayı değildir.");
    }
}

