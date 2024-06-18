package vscode.Easy_Level;

import java.util.*;
public class _27_Fibonacci_series {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of terms:");
        int n = sc.nextInt();
        int a1=0, a2=1;
        for(int i=0; i<n; i++){
            System.out.print(a1+" ");
            int a3=a1+a2;
            a1=a2;
            a2=a3;
        }    
    }
}
