package com.day9;

import java.util.Scanner;

public class MatrixSorting {

//    . Sort a matrix in ascending order in a given direction
//
//            (Horizontal ->, Vertical |, diagonal \)

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Get the number of rows and columns from the user
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        // Create a 2D array to store the matrix elements
        int[][] matrix = new int[rows][cols];

        // Get the matrix elements from the user
        System.out.println("Enter the matrix elements:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        MatrixSorting matrixSorting = new MatrixSorting();
        matrixSorting.verticalSorting(matrix);
        matrixSorting.diagonalSorting(matrix);

    }



    void print(int[][] arr) {

        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++)
                System.out.print(arr[i][j]+" ");
            System.out.println();
        }

    }

    void verticalSorting(int[][] arr) {

        System.out.println("Vertical Sorting");

        for (int j = 0; j < arr[0].length; j++) {

            for (int i = 0; i < arr.length; i++) {

                int index = i;
                for (int k = i + 1; k < arr.length; k++) {

                    if (arr[index][j] > arr[k][j])
                        index = k;
                }
                int temp = arr[index][j];
                arr[index][j] = arr[i][j];
                arr[i][j] = temp;

            }
        }
        print(arr);
    }

    void diagonalSorting(int[][] arr) {

        System.out.println("Diagonal Sorting");

        for (int i = 0; i < arr.length; i++) {

            for(int j=0;j<arr[0].length;j++){

                int m = i + 1, n = j + 1;
                int ind1 = i, ind2 = j;
                while (m < arr.length && n < arr[0].length) {

                    if (arr[ind1][ind2] > arr[m][n]) {
                        ind1 = m;
                        ind2 = n;
                    }
                    m++;
                    n++;
                }
                int temp = arr[ind1][ind2];
                arr[ind1][ind2] = arr[i][j];
                arr[i][j] = temp;

            }
        }
        print(arr);

    }

}
