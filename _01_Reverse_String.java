package vscode.Easy_Level;

import java.util.Scanner;
public class _01_Reverse_String {
    public static void main(String[] args){
        System.out.print("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        String empty = "";

        int n= name.length();

        for(int i=n-1;i>=0; i-- ){
            empty+=name.charAt(i);
        }
        System.out.println("Reverse String:"+empty);
    }
    
}
