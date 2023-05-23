package arrays;

import java.util.Arrays;

public class DiziFrekans {
    public static void main(String[] args) {
        int[] list = {23,2,8,7,66,45,10,36,9,2,2,6,5,7,3,9,85,6,5,66,88,5,4,4,11,6,5,23,4,8,7,11,26};
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        int counter;

        for (int i=0;i<list.length;i++){
            counter=1;
            for (int j=0;j<list.length;j++){
                if (i!=j && list[i]==list[j]) {
                    counter++;
                }
            }
            if (i==list.length-1||list[i]!=list[i+1]){
                System.out.println("[" + list[i]+"] sayısı "+counter+" kere tekrar edildi.");
            }
        }
    }
}
