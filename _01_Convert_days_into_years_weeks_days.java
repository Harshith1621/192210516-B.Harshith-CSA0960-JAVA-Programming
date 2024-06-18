package vscode.Hard_Level;

import java.util.*;

public class _01_Convert_days_into_years_weeks_days {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of days:");
        int n = sc.nextInt();
        int years = n/365;
        int x = n%365;
        int weeks = x/7;
        int days = x%7;
        System.out.println("Years:"+years);
        System.out.println("Weeks:"+weeks);
        System.out.println("Days:"+days);
    }
    
}
