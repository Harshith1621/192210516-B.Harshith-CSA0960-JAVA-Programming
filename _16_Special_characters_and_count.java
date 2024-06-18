package vscode.Easy_Level;

import java.util.Scanner;
public class _16_Special_characters_and_count {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter the string:");
        String s = sc.nextLine();
        n=s.length();
        char arr[] = new char[n];
        int count = 0;
        System.out.print("Special Characters:");
        for(int i=0; i<n; i++){
            arr[i] = s.charAt(i);
            if(arr[i]>=65 && arr[i]<=90 || arr[i]>=97 && arr[i]<=122 || arr[i]>=48 && arr[i]<=57){

            }else{
                count+=1;
                System.out.print(arr[i]);
            }
        }
        System.out.println();
        System.out.println("Count: "+count);

    }
    
}
