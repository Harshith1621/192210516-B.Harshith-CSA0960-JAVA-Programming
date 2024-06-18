package vscode.Easy_Level;

import java.util.*;
public class _32_Pattern {
    public static void main(String[] args){
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter rows:");
        int n= sc.nextInt();
        int k=1;
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(k*k+" ");
                k++;
            }
            System.out.println();
        }
    }
    
}
