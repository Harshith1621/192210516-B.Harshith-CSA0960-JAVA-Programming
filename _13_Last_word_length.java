package vscode.Hard_Level;

import java.util.*;
public class _13_Last_word_length {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
       String[] a = s.split(" ");
       int x = a.length;
       for(int i =x-1;i>=0;i--){
        System.out.println(a[i]);
       }
    }
    
}
