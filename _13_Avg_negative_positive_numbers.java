package vscode.Medium_Level;

import java.util.*;
public class _13_Avg_negative_positive_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double ps=0,ns=0;
        int i=0,j=0;
      //  System.out.print("Enter number:");
        int n=0;
        System.out.println("Enter -1 to exit....");
        while(n!=-1){
        System.out.print("Enter number:");
            n=sc.nextInt();
            if(n==-1){
                break;
            } 
            if(n>0){
                i++;
                ps+=n;
            }else{
                j++;
                ns+=n;
            }
        }
        double x = ps/i;
        System.out.print("Average of positive numbers:"+x);
        double y = ns/j;
        System.out.print("\nAverage of negative numbers:"+y);  
    }
}
