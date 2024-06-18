package vscode.Hard_Level;

import java.util.*;
public class _05_Perfect_numbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter lower range:");
        int a = sc.nextInt();
        System.out.print("Enter the upper range:");
        int b = sc.nextInt();
        //int sum =0;
        if(a<b){
            for(int i=1;i<b;i++){
                int sq =i*i;
                int num = sq;
                int sum=0;
                while(num!=0){
                    int rem =num%10;
                    sum +=rem;
                    num/=10;
                }
                if((sq>=a && sum<10)&&sq<b){
                    System.out.print(sq+" ");
                }
            }
        }else{
            for(int i=1;i<a;i++){
                int sq =i*i;
                int num = sq;
                int sum=0;
                while(num!=0){
                    int rem =num%10;
                    sum +=rem;
                    num/=10;
                }
                if((sq<=a&& sum<10)&&sq>=b){
                    System.out.print(sq+" ");
                }
            }

        }
    }  
}
