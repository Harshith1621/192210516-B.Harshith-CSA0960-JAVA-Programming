package vscode.Hard_Level;

import java.util.*;
public class _09_Until_to_get_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        while(num>0){
            int sum=0;
            int temp = num;
            while(num>0){
                int rem = num%10;
                sum=sum*10+rem;
                num/=10;
            }
            if(temp==sum){
                System.out.println("Palindrome number:"+sum);
                break;
            }else{
                num=temp+sum;
            }
        }
}
}
