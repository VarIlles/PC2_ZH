import java.util.ArrayList;

public class Matrix {

    public static int sumOfNumbersDivisibleByFive(int[][] matrix) {

        int divisibleByFive = 0;

        for (int i = 0; i < matrix.length; i++) {
            System.out.println("\n\n");
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]);
                System.out.print("\t\t");
                if ((matrix[i][j]%5)==0) {
                    divisibleByFive += matrix[i][j];
                }
            }
        }

        return divisibleByFive;
    }

    public static ArrayList<Integer> indexOfRowsWithZeros(int[][] matrix){
        int[] eredmeny = new int[matrix[0].length];

        ArrayList<Integer> nullRowIndex = new ArrayList<>();

        for(int i = 0; i < matrix.length; i++){
            System.out.println();
            for (int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j]);
                System.out.print("\t\t");
                if(matrix[i][j] == 0){
                    eredmeny[i]++;
                }
            }
        }
        for (int k = 0; k < eredmeny.length; k++){

            if (eredmeny[k] == matrix.length){
                nullRowIndex.add(k);
            }
        }
        return nullRowIndex;
    }
}