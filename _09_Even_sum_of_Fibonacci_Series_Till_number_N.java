package vscode.Easy_Level;


import java.util.Scanner;
public class _09_Even_sum_of_Fibonacci_Series_Till_number_N {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of terms:");
        int x= sc.nextInt();
        int a1=0, a2=1, a3;
        int a[]=new int[x];
        System.out.println();
        System.out.print("Series: ");
        for(int i=0; i<x; i++ ){
            a[i]=a1;
            System.out.print(a[i]+" ");

            a3=a1+a2;
            a1=a2;
            a2=a3;

        }
        System.out.println("Enter N value:");
        int n = sc.nextInt();
        int sum=0;
        for(int i=0; i<n*2;i+=2){
            sum+=a[i];
        
        }
        System.out.print(sum);
    }
}
