package org.example.Matrix;
import java.util.*;

public class AddMatricesClass {
    public static void main(String [] args){
        System.out.println("Enter the column size");
        Scanner sc = new Scanner(System.in);
        int column = sc.nextInt();
        System.out.println("Enter the row size");
        int row = sc.nextInt();

        System.out.println("Enter elements of first array");
        int i = 0;
        int j = 0;
        int array1[][] = new int[column][row];
        for(i = 0; i < column; i++){
            for(j = 0; j < row; j++){
                System.out.println("Array1["+i+"]["+j+"] : ");
                array1[i][j] = sc.nextInt();
            }
        }

        System.out.println("Enter elements of second array");

        int array2[][] = new int[column][row];
        for(i = 0; i < column; i++){
            for(j = 0; j < row; j++){
                System.out.println("Array2["+i+"]["+j+"] : ");
                array2[i][j] = sc.nextInt();
            }
        }

        int sum[][] = new int[i][j];
        for(i = 0; i < column; i++){
            for(j = 0; j < row; j++){
               sum[i][j] = array1[i][j] + array2[i][j];
            }
        }

        System.out.println("Sum = ");
        for(i = 0; i < column; i++){
            for(j = 0; j < row; j++){
                System.out.print(sum[i][j]+"  ");
            }
            System.out.println("");
        }

    }
}
