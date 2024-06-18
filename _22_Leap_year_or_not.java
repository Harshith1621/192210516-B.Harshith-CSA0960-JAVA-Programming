package vscode.Easy_Level;

import java.util.*;
public class _22_Leap_year_or_not {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the date:");
        String s = sc.nextLine();
        String arr[] = s.split("/");
        String year =arr[2];
        int num = Integer.parseInt(year);
        if((num%4==0 && num%100!=0) || num%400 ==0){
            System.out.println(" Leap Year");
        }else{
            System.out.println("Not Leap Year");
        }

    }
    
}
