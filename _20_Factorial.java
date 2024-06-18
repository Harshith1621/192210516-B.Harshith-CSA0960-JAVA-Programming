package vscode.Easy_Level;

import java.util.Scanner;
public class _20_Factorial {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");

        String s= sc.nextLine();

        try{
            int n =Integer.parseInt(s);
            if(n<0){
                System.out.println("Factorial of anegative number is not defined");
            }else{
                System.out.println("Factorial of given number:"+factorial(n));
            }
        }
            catch(NumberFormatException n){
                System.out.println("Enter valid input. Please enter valid Integer.");
            }
        }
    public static int factorial(int n){
        if(n==0 || n==1){
            return 1;
        }
        int fact =1;
        for(int i=1; i<=n; i++){
            fact*=i;

        }
        return fact;

    }
    
}
