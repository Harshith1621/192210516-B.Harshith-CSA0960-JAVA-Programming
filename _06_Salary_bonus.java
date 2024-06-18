package vscode.Medium_Level;

import java.util.*;
public class _06_Salary_bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Grade of Employee:");
        char c = sc.next().charAt(0);
        System.out.print("Enter salary:");
        int sal = sc.nextInt();
        double bonus =0;
        if(c=='A'){
            bonus = sal*(0.05);
            if(sal<10000){
                bonus = bonus+sal*(0.02);
            }
            System.out.print("\nSalary of Employee:"+sal);
            System.out.print("\nBonus:"+bonus);
            System.out.print("\nTotal income:"+(sal+bonus));
        }
        else if(c=='B'){
            bonus = sal*(0.10);
            if(sal<10000){
                bonus = bonus+sal*(0.02);
            }
            System.out.print("\nSalary of Employee:"+sal);
            System.out.print("\nBonus:"+bonus);
            System.out.print("\nTotal income:"+(sal+bonus));

        } 
        else{
            System.out.println("Enter valid Grade");
        } 
    }
}
