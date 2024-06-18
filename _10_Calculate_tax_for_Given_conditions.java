package vscode.Medium_Level;

import java.util.*;
public class _10_Calculate_tax_for_Given_conditions {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Income:");
        int x = sc.nextInt();
        if(x<=150000){
            System.out.println("No Tax");
        }else if(x>=150001 && x<=300000){
            System.out.print("Tax:"+x*(0.10));
        }else if(x>=300001 && x<=500000){
            System.out.print("Tax:"+x*(0.2));
        }else if(x>=500001){
            System.out.print("Tax:"+x*(0.3));
        }
    }
    
}
