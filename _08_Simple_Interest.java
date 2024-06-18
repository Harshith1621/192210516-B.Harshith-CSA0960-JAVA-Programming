package vscode.Easy_Level;

import java.util.Scanner;
public class _08_Simple_Interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the principle amount:");
        int p = sc.nextInt();
        System.out.print("Enter the no. of years:");
        int t = sc.nextInt();
        System.out.print("Is customer Senior Citizen? (y/n): ");
        char rate =sc.next().charAt(0);
        double interest =0.0;
        if(rate == 'y'){
            interest = (p*t*0.12)/100;
            System.out.println(interest);
        }else{
            interest = (p*t*0.10)/100;
            System.out.println(interest);
        }
        
    }
    
}
