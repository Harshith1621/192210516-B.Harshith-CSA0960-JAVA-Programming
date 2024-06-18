package vscode.Easy_Level;

import java.util.Scanner;
public class _12_Rectangle_pattern {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n,m;
        System.out.println("Enter rows:");
        n= sc.nextInt();
        System.out.println("Enter columns:");
        m= sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=m; j++){
                if(i==1 || j==1 || i==n || j==m){
                    System.out.print("*");

                }else{
                System.out.print(" ");
                }
            System.out.print(" ");
        }
            System.out.println();
        }
    }
    
}
