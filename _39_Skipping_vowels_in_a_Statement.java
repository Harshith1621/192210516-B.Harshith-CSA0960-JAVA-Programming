package vscode.Easy_Level;

import java.util.*;
public class _39_Skipping_vowels_in_a_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter String:");
        String s = sc.nextLine();
        /*int len = s.length();
        char[] a = new char[len]; 
        for(int i=0; i<len; i++){
            a[i]=s.charAt(i);
            if(a[i]=='a' || a[i]=='e' || a[i]=='i' || a[i]=='o' || a[i]=='u'){
                continue;
            }
            System.out.print(a[i]);*/
        String s1 = s.replaceAll("[aeiouAEIOU]","");
        System.out.println(s1);
            
    }

}
