package vscode.Easy_Level;

import java.util.*;
public class _23_Number_of_factors {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number:");
        int num = sc.nextInt();
        int count = 0;
        for(int i=1; i<=num; i++){
            if(num%i==0){
                count+=1;
            }
        }
        System.out.println("Number of Factors:"+count);


    }
    
}
