package vscode.Medium_Level;

import java.util.*;
public class _07_First_N_Perfect_Numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value:");
        int n = sc.nextInt();
        int x=0;
        System.out.print("First "+n+" Perfect numbers are:");
        while(x<n){
            for(int i=1; i<Integer.MAX_VALUE;i++){
                int sum=0;
                for(int j=1; j<i; j++){
                    if(i%j==0){
                        sum+=j;
                    }
                }
                if(sum==i){
                    System.out.print(i+" ");
                    x++;
                }
                if(n==x){
                    break;
                }
            }
        }
    }
}
