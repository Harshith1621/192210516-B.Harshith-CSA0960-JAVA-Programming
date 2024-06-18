package vscode.Easy_Level;

import java.util.*;
public class _25_Number_of_vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String:");
        String name = sc.nextLine();
        int len = name.length();
        char a[] = new char[len];
        int count =0;
        for(int i=0; i<len; i++){
            a[i]=name.charAt(i);
            if(a[i]=='a'|| a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u' ||a[i]=='A' || a[i]=='E' || a[i]=='I' || a[i]=='O' || a[i]=='U'){
                count++;
            }
        }
        System.out.println("Number of Vowels:"+count);
    }
    
}
