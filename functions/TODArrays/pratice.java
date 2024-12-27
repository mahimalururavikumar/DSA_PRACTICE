package TODArrays;

import java.util.*;

public class pratice {

    //PRINT ARRAY
    public static void printArr(int matrix[][]) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    //SEARCH LARGEST
    public static void searchLargest(int matrix[][]) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                // System.out.println("Element Found at index ("+i+","+j+")");
                // return true;
                max = Math.max(matrix[i][j], max);
            }
        }
        System.out.println("Largest element is" + max);
        // return false;
    }

    //SPIRAL MATRIX
    public static void spiralMatrix(int matrix[][]) {
        int startRow = 0, startCol = 0, endRow = matrix.length - 1, endCol = matrix[0].length - 1;
        while (startRow <= endRow && startCol <= endCol) {
            // top
            for (int j = startCol; j <= endCol; j++) {
                System.out.print(matrix[startRow][j] + " ");
            }
            // right
            for (int i = startRow + 1; i <= endRow; i++) {
                System.out.print(matrix[i][endCol] + " ");
            }
            // bottom
            for (int j = endCol - 1; j >= startCol; j--) {
                if (startCol == endCol) {
                    break;
                }
                System.out.print(matrix[endRow][j] + " ");
            }
            // left
            for (int i = endRow - 1; i >= startRow + 1; i--) {
                if (startRow == endRow) {
                    break;
                }
                System.out.print(matrix[i][startCol] + " ");
            }
            startRow++;
            startCol++;
            endRow--;
            endCol--;
        }
    }

    //DIAGONAL SUM
    public static void diagonalSum(int matrix[][]) {
        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            sum += matrix[i][i];
            if (i != matrix.length - 1 - i) {
                sum += matrix[i][matrix.length - i - 1];
            }
        }

        System.out.println("Sum: " + sum);
    }

    //SORTEDSEARCH
    public static boolean sortedSearch(int matrix[][], int key) {
        int i = matrix.length - 1, j = 0;
        while (i >= 0 && j < matrix[0].length) {
            if (matrix[i][j] == key) {
                System.out.println("Element found at Index (" + i + "," + j + ")");
                return true;
            } else if (matrix[i][j] > key) {
                i--;
            } else {
                j++;
            }
        }
        System.out.println("Element Not Found!");
        return false;
    }

    //TRANSPOSE MATRIX
    public static void transposeMatrix(int matrix[][]) {
        int trans[][] = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                trans[j][i] = matrix[i][j];
            }
        }
        printArr(trans);
    }

    //ROWSUM
    public static void rowSum(int matrix[][]){
        int i = 1,sum = 0;
        for(int j=0;j<matrix[0].length;j++){
            sum += matrix[i][j];
        }
        System.out.println("Sum: "+sum);
    }

    //COUNTOFARRAY
    public static int Count(int matrix[][], int key){
        int count=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j] == key){
                    count++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int matrix[][] = {
                { 1, 1, 1 },
                { 2, 2, 2 },
                { 3, 3, 3 } };
        // int key = 7;
        // System.out.println(Count(matrix, key));
        diagonalSum(matrix);
        sc.close();
    }
}
