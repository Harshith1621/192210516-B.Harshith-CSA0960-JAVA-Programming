package vscode.Easy_Level;

import java.util.*;
public class _05_LCM_GCD {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements:");
        int n=sc.nextInt();
        int[] a=new int[n];
        for(int i=0;i<n; i++){
           a[i]=sc.nextInt();
        }
        System.out.print("GCD:"+findgcd(a,n));
        System.out.println("\nLCM:"+lcm(a));
    }
    static int findgcd(int a[], int n){
        int x=a[0];
        for(int i=0; i<n; i++){
           x= gcd(x,a[i]);
           if(x==1){
            return 1;
           }
        } 
        return x;
    }
    static int gcd(int a, int b ){
        if(a==0){
            return b;
        }
        return gcd(b%a,a);
    }
    static int lcm(int[] a){
        int result =a[0];
        for(int i=0; i<a.length; i++)
        {
            result=lcm(result,a[i]);
        }
        return result;
    }
    static int lcm(int a, int b){
        return a*(b/gcd(a,b));
    }
}
