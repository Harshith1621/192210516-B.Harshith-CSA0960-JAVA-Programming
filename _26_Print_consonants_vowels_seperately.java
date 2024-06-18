package vscode.Easy_Level;

import java.util.*;
public class _26_Print_consonants_vowels_seperately {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the string:");
        String s = sc.nextLine();
        int len = s.length();
        char arr[] = new char[len];
        char a[] = new char[len];
        char b[] = new char[len];
        int vow=0, con=0;
        for(int i=0; i<len; i++){
            arr[i]=s.charAt(i);
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' ||arr[i]=='O' || arr[i]=='U'){
                a[vow]=arr[i];
                vow+=1;
            }else{
                b[con]=arr[i];
                con+=1;
            }
        }
        System.out.print("Vowels are:");
        for(int i=0; i<len; i++){
            System.out.print(a[i]+" ");
        }
        System.out.print("\nConsonents ar:");
        for(int i=0; i<len; i++){
            System.out.print(b[i]+" ");
        }
        System.out.println("\nvowels count:"+vow);
        System.out.println("Consonents count:"+con);
        
    }
}
