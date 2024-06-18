package vscode.Easy_Level;


public class _11_Matrix_addition {
    public static void main(String[] args) {
        int mat1 [][]={{1,2,6},{4,3,8},{12,13,4}};
        int mat2 [][] = {{7,6,7},{9,5,8},{1,7,5}};
        int sum[][] =new int[3][3];
        int len =mat1.length;
        //System.out.println(len);
        for(int i=0; i<len; i++){
            for(int j=0; j<len; j++){
                sum[i][j]=mat1[i][j]+mat2[i][j];
                System.out.print(sum[i][j]+"\t");
            }
            System.out.println();
        }


    }
    
}
