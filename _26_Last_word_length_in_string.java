package vscode.Medium_Level;

import java.util.*;
public class _26_Last_word_length_in_string {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //int b = s.split(" ");
        String[] a = s.split(" ");
        int x= a.length;
        for(int i=x-1; i>=0; i--){
            System.out.println(a[i]);
        }
        //int i =x-1;
        //System.out.print(a[i].length());
        //System.out.print(x);

    }
    
}
