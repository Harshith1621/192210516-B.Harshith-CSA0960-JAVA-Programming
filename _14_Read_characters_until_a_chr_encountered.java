package vscode.Hard_Level;

import java.util.*;
public class _14_Read_characters_until_a_chr_encountered {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c ='o';
        int uc=0,lc=0,nc=0;
        while(c!='*'){
            System.out.print("Enter any character:");
            c=sc.next().charAt(0);
            if(c>=65 && c<=92){
                uc+=1;
            }
            else if(c>=95 &&c<=122){
                lc+=1;
            }else if(c>=48 && c<=57){
                nc+=1;
            }
        }
        System.out.println("Total count of lower case:"+lc);
        System.out.println("Total count of upper case:"+uc);
        System.out.println("Total count of numbers:"+nc);
    }
    
}
