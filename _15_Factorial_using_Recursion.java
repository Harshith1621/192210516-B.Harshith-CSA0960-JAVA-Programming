package vscode.Medium_Level;

import java.util.*;
public class _15_Factorial_using_Recursion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int n = sc.nextInt();
        System.out.print("Factorial of "+n+" is:"+factorial(n));
        
    }
    static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        return n*factorial(n-1);         //RECURSION
    }
}
