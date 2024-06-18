package vscode.Medium_Level;

import java.util.*;
public class _04_String_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        /*System.out.print("Enter String:");
        String s1 = sc.nextLine();
        int n = s1.length();
        String s2="";
        for(int i=n-1; i>=0; i--){
            s2=s2+s1.charAt(i);
        }
        if(s1.equals(s2)){
            System.out.println("Given string is Palindrome");
        }else{
            System.out.println("Given String is not Palindrome");
        } */
       System.out.print("Enter number:");
       int x= sc.nextInt();
       int num=x;
       int sum=0;
       while(x!=0){
        int rem = x%10;
        sum=sum*10+rem;
        x/=10;
       }
       //System.out.println(sum);
       if(sum==num){
        System.out.println("Given number is Palindrome");
       }else{
        System.out.println("Given numbe is not palindrome");
       }
    }
}
