package vscode.Easy_Level;
import java.util.*;
public class _41_Sum_of_digits_of_N_digit_number {
    public static void main(String[] args){
        System.out.print("Enter number of digits:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        System.out.println("Enter the number:");
        String num =sc.next();
        int sum=0;
        if(n==num.length()){
            int x= Integer.parseInt(num);
            while(x!=0){
                int rem = x%10;
                sum=sum+rem;
                x/=10;
            }
            System.out.println("Sum of digits:"+sum);
        }else{
            System.out.println("Invalid input");

        }


       }  
}
