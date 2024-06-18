package vscode.Medium_Level;

import java.util.*;
public class _12_Multiplication_table_from_M_toN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter M value:");
        int a = sc.nextInt();
        System.out.print("Enter N value:");
        int b = sc.nextInt();
        for(int i=1; i<=b; i++){
            System.out.println(i+" x "+a+" = "+(i*a));
        }
        
    }
}
