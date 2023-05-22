package classes.BoksOyunu;

public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 15 , 100, 90, 20);
        Fighter alex = new Fighter("Alex" , 10 , 120, 100, 25);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}
