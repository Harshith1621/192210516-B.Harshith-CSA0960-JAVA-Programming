package vscode.Easy_Level;

import java.util.*;
public class _38_Reverse_Alphabetical_order {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        int len = s.length();
        char[] a = new char[len];
        for(int i=0; i<len; i++){
            a[i]=s.charAt(i);
        }
       for(int i=0;i<len; i++){
            for(int j=i+1; j<len; j++){
                if(a[i]>a[j]){
                    char temp = a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println();
        for(int i=len-1; i>=0; i--){
            System.out.print(a[i]+" ");
        }
    }  
}
