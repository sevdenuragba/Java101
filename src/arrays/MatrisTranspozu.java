package arrays;
import java.util.Arrays;

public class MatrisTranspozu {

    public static void main(String[] args) {
        int[][] matrix = {{1,2,3},{4,5,6}};
        int[][] transMatris = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length ; i++){
            for (int j = 0 ; j < matrix[i].length ; j++){
                transMatris[j][i] = matrix[i][j];
            }
        }
        System.out.println("Matris: ");
        for (int[] row : matrix){
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Matris transpozu: ");
        for (int[] row : transMatris){
            System.out.println(Arrays.toString(row));
        }


    }
}