package arrays;

import java.util.Arrays;

public class TekrarEdenSayi {
    static boolean isFind(int[]arr ,int value){
        for(int i: arr){
            if(i == value){
                return true;
            }
        }
        return false;
    }
    public static void main(String[]args){
        int []list = {8,6,9,55,33,7,6,2,2,46,55,36,71,0,8,2,16,22,4,22,16,9,56,32,2,15,14,7,14};

        int[]duplicate = new int[list.length];
        int startIndex  = 0;
        for(int i = 0 ; i < list.length ; i++) {
            for (int j = 0 ; j < list.length ; j++){
                if(i != j  &&  (list[i] == list[j])){
                    if(! isFind(duplicate, list[i])){
                        duplicate[startIndex++] = list[i];
                    }
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(list));
        System.out.print("Tekrar eden çift sayılar :  ");
        for(int value:duplicate){
            if(value!=0 && value % 2 == 0){
                System.out.print(value+"  ");
            }
        }
    }
}
