package apps;

import java.util.Scanner;

public class EtkinlikOnermeDemo {
    public static void main(String[] args) {

        int heat;
        Scanner scanner=new Scanner(System.in);
        System.out.println("Hava kaç derece?");
        heat= scanner.nextInt();
        if(heat<5)
            System.out.println("Kayağa gidebilirsiniz.");

        else if (heat>5 && heat<15)
            System.out.println("Sinemaya gidebilirsiniz.");

        else if (heat>15 && heat<25)
            System.out.println("Pikniğe gidebilirsiniz.");

        else
            System.out.println("Yüzmeye gidebilirsiniz.");

    }
}
