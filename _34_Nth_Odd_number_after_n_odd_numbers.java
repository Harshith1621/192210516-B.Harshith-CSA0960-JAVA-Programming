package vscode.Easy_Level;

import java.util.*;
public class _34_Nth_Odd_number_after_n_odd_numbers {
    public static void main(String[] args){
        System.out.print("Enter the N value:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[100];
        int j=1;
        for(int i=1; i<=100; i++){
            if(i%2!=0){
                a[j]=i;
                j++;
            }
        }
        System.out.print(n+"th odd number after "+n+" odd numbers:"+a[n*2]);

    }
    
}
