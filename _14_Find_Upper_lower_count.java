package vscode.Medium_Level;

import java.util.*;
public class _14_Find_Upper_lower_count {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //System.out.print("Enter any character:");
        char c='o';
        int uc=0,lc=0,nc=0;         //uppercount, lowercount, numbercount
        while(c!='*'){
            System.out.print("Enter any character:");
            c = sc.next().charAt(0);
            if(c>=65 && c<=90){
                uc+=1;
            }else if(c>=97 && c<=122){
                lc+=1;
            }else if(c>=48 && c<=57){
                nc+=1;
            }
        }
        System.out.print("Total count of Lowercas:"+lc);
        System.out.print("\nTotal count of Uppercase:"+uc);
        System.out.print("\nTotal count of digits:"+nc);
        
    }
}
