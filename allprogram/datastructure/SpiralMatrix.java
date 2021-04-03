package allprogram.datastructure;

public class SpiralMatrix {
    public static void main(String[] args) {
        int[][] matrix2D = new int[][]{
                                         {10,20,30,40}
                                        ,{11,22,33,44}
                                        ,{50,60,70,80}
                                        ,{55,66,77,88}
                                       };
        System.out.println("*************SpiralMatrix***********");
        int row_start,row_end,col_start,col_end;
        row_start=col_start=0;
        row_end=4;col_end=4;
        int i;
        for (int j = 0; j < matrix2D.length; j++) {
            for (int k = 0; k < matrix2D[j].length; k++) {
                System.out.print(matrix2D[j][k]+",");
            }
            System.out.println();
        }
        System.out.println();
        while (row_start<row_end && col_start<col_end ){
            for (i = col_start; i < col_end; i++) {
                System.out.print(matrix2D[row_start][i]+","); //  {10,20,30,40}, - 00,01,02,03
            }
            row_start++;
            for (i = row_start; i < row_end; i++) {
                System.out.print(matrix2D[i][col_end-1]+",");// {44,80,88} - 13,23,33
            }
            col_end--;
            if(row_start < row_end) {
                for (i = col_end - 1; i >= col_start; i--) {
                    System.out.print(matrix2D[row_end - 1][i] + ",");//{77,66,55} - 32,31,30
                }
                row_end--;
            }
            if (col_start < col_end) {
                for (i = row_end - 1; i >= row_start; i--) {
                    System.out.print(matrix2D[i][col_start] + ",");//{50,51} - {20,10}
                }
                col_start++;
            }
        }

    }
}
