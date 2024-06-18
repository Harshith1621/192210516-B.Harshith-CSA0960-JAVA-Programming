package vscode.Easy_Level;

import java.util.Scanner;
public class _18_Inverted_Full_Pyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the rows:");
        n = sc.nextInt();
        System.out.println("Inverted pyramid:");
        for(int i=1; i<=n; i++){
            for(int k=0;k<i; k++){
                System.out.print(" ");
            }
            for(int j=1; j<=n-i+1; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    
}
