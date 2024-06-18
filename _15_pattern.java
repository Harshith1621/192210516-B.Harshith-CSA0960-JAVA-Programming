package vscode.Easy_Level;

import java.util.Scanner;
public class _15_pattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n,x;
        System.out.println("Enter the number to be printed:");
        x=sc.nextInt();
        System.out.println("Max number of times printed:");
        n = sc.nextInt();
        System.out.println("Pattern:");
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
        for(int i=n-1;i>=1;i-- ){
            for(int j=1; j<=i; j++){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
    
}
