package vscode.Easy_Level;

import java.util.*;
public class _36_Find_character_in_Statement {
    public static void main(String[] args){
        System.out.print("Enter he sentence:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int len = s.length();
        int a=0;
        char[] arr = new char[len];
        System.out.print("Enter Character:");
        char x = sc.next().charAt(0);
        for(int i=0; i<len ;i++){
            arr[i]=s.charAt(i);
            if(x==arr[i]){
                System.out.print("Character foouded at the index:"+(i+1));
                a=1;
            }
        }
        if(a==0){
            System.out.println("Character is not founded");
        }


    }
    
}
