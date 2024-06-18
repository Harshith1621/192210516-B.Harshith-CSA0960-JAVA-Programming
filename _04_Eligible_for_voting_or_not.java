package vscode.Easy_Level;


import java.util.Scanner;
public class _04_Eligible_for_voting_or_not {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the age:");
        int age = sc.nextInt();
        if(age>18){
            System.out.println("You are Eligible for vote");
        }else if(age<=0){
            System.out.println("Enter the age correctly");
        }else{
            System.out.println("You are Eligible for vote after "+(18-age)+"years");
        }

    }
    
}
