package vscode.Hard_Level;

import java.util.*;
public class _03_Nth_factor_and_number_of_factors {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int num = sc.nextInt();
        int count=0;
        for(int i=1;i<=num;i++){
            if(num%i==0){
                count+=1;
            }
        }
        int [] a = new int[count];
        int x=0;
        System.out.print("Factors:");
        for(int i=1;i<=num;i++){
            if(num%i==0){
                a[x]=i;
                System.out.print(a[x]+" ");
                x++;
            }
        }
        System.out.print("\nEnter N value:");
        int n = sc.nextInt();
        System.out.println("Number of factors:"+count);
        System.out.println(n+"th Factor for "+num+":"+a[n-1]);
    }
}
