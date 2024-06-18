package vscode.Medium_Level;

import java.util.*;
public class _09_Marks_of_student_aggregate_total_grade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter marks in 1st sub:");
        int a1 = sc.nextInt();
        System.out.print("Enter marks in 2nd sub:");
        int a2 = sc.nextInt();
        System.out.print("Enter marks in 3rd sub:");
        int a3 = sc.nextInt();
        System.out.print("Enter marks in 4th sub:");
        int a4 = sc.nextInt();
        int total = a1+a2+a3+a4;
        System.out.print("Total marks:"+total);
        double x = total/4.0;
        System.out.print("\nAggregate:"+x);
        if(x>75){
            System.out.println("\nDISTINCTION");
        }else if(x>=60 && x<=75){
            System.out.println("First Division");

        }else if(x>=50 && x<60){
            System.out.println("Second Devision");
        }else if(x>=40 && x<50){
            System.out.println("Third Devision");
        }else{
            System.out.println("Fail");
        }
        
    }
}
