package arrays;

public class HarmonikOrtalama {
    public static void main(String[] args) {
        double harmonikSeri;
        double sum = 0;
        double harmonikAvarage = 0.0;

        int[] list = {23,2,8,7,66,45,10,36,9};

        for (int i : list){
            harmonikSeri = 1.0 / i;
            sum += harmonikSeri;
            harmonikAvarage = list.length / sum;
        }
        System.out.println("Harmonik ortalama: " + harmonikAvarage);
    }
}
