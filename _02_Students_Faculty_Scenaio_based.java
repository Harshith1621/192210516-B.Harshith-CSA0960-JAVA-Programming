package vscode.Hard_Level;

import java.util.*;
public class _02_Students_Faculty_Scenaio_based {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nTotal Users:");
        int total = sc.nextInt();
        System.out.print("Staff Users:");
        int staff_users = sc.nextInt();
        int non_teaching = staff_users/3;
        int students = total-(staff_users+non_teaching);
        System.out.print("Student Users:"+students);

    }
    
}
