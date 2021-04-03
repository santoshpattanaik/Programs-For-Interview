package allprogram.backup;

import java.util.Scanner;

public class MatrixPrint {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no of rows : ");
        int row = Integer.parseInt(scanner.next());
        System.out.print("\nEnter no of columns : ");
        int col = Integer.parseInt(scanner.next());
        System.out.print("\nNo of elements to be entered : "+row*col);
        int matrix[][] = new int[row][col];
        for(int i =0;i<row;i++){
            for (int j=0;j<col;j++){
                matrix[i][j] = Integer.parseInt(scanner.next());
            }
        }
        System.out.println("Matrix of "+row+"X"+col+" is as follows");
        for(int i =0;i<row;i++){
            for (int j=0;j<col;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
    }
}
