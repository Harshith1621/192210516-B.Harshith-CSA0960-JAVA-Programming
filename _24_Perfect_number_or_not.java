package vscode.Easy_Level;

import java.util.*;
public class _24_Perfect_number_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int sum=0;
        for(int i=1;i<num; i++){
            if(num%i==0){
                sum+=i;
            }
        }
        if(sum==num){
            System.out.println("It's a Perfect Number");
        }
    }  
}
