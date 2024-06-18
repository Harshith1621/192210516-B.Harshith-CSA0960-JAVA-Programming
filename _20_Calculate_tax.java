package vscode.Hard_Level;

import java.util.*;
public class _20_Calculate_tax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the income:");
        double income = sc.nextInt();
        double tax=calculate_tax(income);

        System.out.println("Taxable Income:"+income);
        System.out.println("Tax:"+tax);
        
    }
    static double calculate_tax(double income){
        double tax =0;
        if(income<=250000){
            tax=0;
        }else if(income<=500000){
            tax = (income-250000)*0.10;
           // System.out.println("Taxable income:"+tax);
            //System.out.println("Tax:"+tax);
        }else if(income<=1000000){
            tax =(250000*0.10) + (income-500000)*0.20;
           // System.out.println("Taxable income:"+tax);
        }else if(income>1000000){
            tax=(250000*0.10) +(500000*0.20) + (income-1000000)*0.30;
           // System.out.println("Taxable income:"+tax);
        }else{
           // System.out.println("Invalid Input");
        }
        return tax;

    }
}
