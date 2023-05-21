package introduction;

import java.util.Scanner;

public class KullaniciGirisiDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password, yeniPassword, userName;
        int secim;

        System.out.print("Kullanıcı adınızı giriniz:");
        userName = scanner.nextLine();

        System.out.print("Şifrenizi giriniz:");
        password = scanner.nextLine();

        if (password.equals("java123") && userName.equals("patika")) {
            System.out.print("Giriş başarılı.");
        }
        else if (userName != "patika" && password.equals("java123")) {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
        }
        else {
            System.out.println("Kullanıcı adı veya şifre yanlış.");
            System.out.print("Şifremi Unuttum\n" + "1-Evet \n2-Hayır");
            secim = scanner.nextInt();

            switch (secim) {
                case 1:
                    System.out.print("Yeni sifrenizi giriniz:");
                    yeniPassword = scanner.next();
                    if (yeniPassword.equals("java123")) {
                        System.out.print("Yeni şifreniz eskisiyle aynı olamaz.");
                    } else {
                        System.out.print("Şifreniz başarıyla değiştirilmiştir.");
                    }
                    break;
                case 2:
                    System.out.print("İşlem sonlandı.");
                    break;
                default:
                    System.out.print("Hatalı giriş yaptınız.");
            }
        }
    }
}
