package vscode.Medium_Level;

import java.util.*;
public class _03_Amount_available_in_ATM_based_on_conditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Total Denominations are:2000, 500, 200 and 100");
        System.out.print("\nEnter 1st Denomination:");
        int d1 =sc.nextInt();
        System.out.print("Enter the 1st Denomination number of notes:");
        int n1 = sc.nextInt();
        System.out.print("Enter 2nd Denomination:");
        int d2 = sc.nextInt();
        System.out.print("Enter 2nd Denomination number of notes:");
        int n2 = sc.nextInt();
        System.out.print("Enter 3rd Denomination:");
        int d3 = sc.nextInt();
        System.out.print("Enter 3rd Denomination number of notes:");
        int n3 = sc.nextInt();
        System.out.print("Enter 4rd Denomination:");
        int d4 = sc.nextInt();
        System.out.print("Enter 4rd Denomination number of notes:");
        int n4 = sc.nextInt();
        int t=((d1*n1)+(d2*n2)+(d3*n3)+(d4*n4));
        System.out.println("Total available Balance:"+t);      
    }
}
