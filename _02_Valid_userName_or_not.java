package vscode.Easy_Level;

import java.util.Scanner;

public class _02_Valid_userName_or_not {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the user name:");
        String s1 = sc.nextLine();
        System.out.print("Re-Enter the user name:");
        String s2 = sc.nextLine();
        if(s1.equals(s2)){
            System.out.print("User name is valid");
        }else{
            System.out.print("User name is invalid");
        }
        
        
    }
    
}
