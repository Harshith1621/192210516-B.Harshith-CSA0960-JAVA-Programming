package vscode.Easy_Level;

import java.util.Scanner;
public class _06_Right_angle_triangle {
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the rows:");
        n= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }


    }
    
}
