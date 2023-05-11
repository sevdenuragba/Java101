package apps;

import java.util.Scanner;

public class BurcBulmaDemo {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int month, date;
        boolean isError = false;

        System.out.println("Ay: ");
        month = scanner.nextInt();

        System.out.println("Gün: ");
        date = scanner.nextInt();


        if (month == 1) {
            if ((date > 0) && (date <= 32)) {
                if (date < 22) {
                    System.out.print("Oğlak");
                } else {
                    System.out.print("Kova");
                }

            } else {
                isError = true;
            }
        } else if (month == 2) {
            if ((date > 0) && (date <= 28)) {
                if (date < 20) {
                    System.out.print("Kova");
                } else {
                    System.out.print("Balık");
                }
            } else {
                isError = true;
            }
        } else if (month == 3) {
            if ((date > 0) && (date <= 31)) {
                if (date < 21) {
                    System.out.print("Balık");
                } else {
                    System.out.print("Koç");
                }
            } else {
                isError = true;
            }
        } else if (month == 4) {
            if ((date > 0) && (date <= 30)) {
                if (date < 21) {
                    System.out.print("Koç");
                } else {
                    System.out.print("Boğa ");
                }
            } else {
                isError = true;
            }
        } else if (month == 5) {
            if ((date > 0) && (date <= 31)) {
                if (date < 22) {
                    System.out.print("Boğa");
                } else {
                    System.out.print("İkizler");
                }
            } else {
                isError = true;
            }
        } else if (month == 6) {
            if ((date > 0) && (date <= 30)) {
                if (date < 23) {
                    System.out.print("İkizler");
                } else {
                    System.out.print("Yengeç");
                }
            } else {
                isError = true;
            }
        } else if (month == 7) {
            if ((date > 0) && (date <= 31)) {
                if (date < 23) {
                    System.out.print("Yengeç");
                } else {
                    System.out.print("Aslan");
                }
            } else {
                isError = true;
            }
        } else if (month == 8) {
            if ((date > 0) && (date <= 30)) {
                if (date < 23) {
                    System.out.print("Aslan");
                } else {
                    System.out.print("Başak");
                }
            } else {
                isError = true;
            }
        } else if (month == 9) {
            if ((date > 0) && (date <= 31)) {
                if (date < 23) {
                    System.out.print("Başak");
                } else {
                    System.out.print("Terazi");
                }
            } else {
                isError = true;
            }
        } else if (month == 10) {
            if ((date > 0) && (date <= 30)) {
                if (date < 23) {
                    System.out.print("Terazi");
                } else {
                    System.out.print("Akrep");
                }
            } else {
                isError = true;
            }
        } else if (month == 11) {
            if ((date > 0) && (date <= 31)) {
                if (date < 22) {
                    System.out.print("Akrep");
                } else {
                    System.out.print("yay");
                }
            } else {
                isError = true;
            }
        } else if (month == 12) {
            if ((date > 0) && (date <= 30)) {
                if (date < 23) {
                    System.out.print("Yay");
                } else {
                    System.out.print("Oğlak");
                }
            }}
        if (isError) {
            System.out.print("Hatalı giriş.");
        } else {
            System.out.println("");
        }

    }
}
