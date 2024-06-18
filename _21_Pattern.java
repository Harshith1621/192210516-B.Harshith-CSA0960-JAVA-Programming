package vscode.Easy_Level;

import java.util.Scanner;
public class _21_Pattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the character to be printed:");
        char x = sc.next().charAt(0);

        System.out.println("Enter rows:");
        int n = sc.nextInt();
        
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
    
}
