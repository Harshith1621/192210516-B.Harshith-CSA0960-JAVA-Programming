package vscode.Easy_Level;


import java.util.Scanner;
public class _14_matrix_multiplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the rows and columns:");
        int m,n;
        m = sc.nextInt();
        n = sc.nextInt();
        int[][] mat1 = new int[m][n];
        System.out.println("Enter the rows and columns:");
        int p, q;
        p= sc.nextInt();
        q = sc.nextInt();
        int[][] mat2 = new int[p][q];

        int[][] multi_mat = new int[m][q];
        System.out.println("Enter elements:");

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat1[i][j]=sc.nextInt();
            }
        }
        System.out.println("Enter elements:");

        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){
                mat2[i][j]=sc.nextInt();
            }
        }
        System.out.println("First matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                System.out.print(mat1[i][j]+"\t");
            }
            System.out.println();
        }

        System.out.println("Second matrix:");
        for(int i=0; i<p; i++){
            for(int j=0; j<q; j++){
                System.out.print(mat2[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Multiplication matrix:");
        for(int i=0; i<m; i++){
            for(int j=0; j<q; j++){
                multi_mat[i][j]=0;
                for(int k=0; k<m; k++){
                    multi_mat[i][j]+=mat1[i][k]*mat2[k][j];
                }
                System.out.print(multi_mat[i][j]+"\t");
            }
            System.out.println();
        }




        
    }
    
}
