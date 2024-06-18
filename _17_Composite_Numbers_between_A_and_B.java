package vscode.Easy_Level;


import java.util.Scanner;
public class _17_Composite_Numbers_between_A_and_B {
    public static void main(String[] args){
        /*  Scanner sc= new Scanner(System.in);
        int a, b;
        System.out.println("Enter the start value:");
        a=sc.nextInt();
        System.out.println("Enter the end value:");
        b=sc.nextInt();
        System.out.println("Composite numbers:");
        for(int i=a+1; i<=b; i++){
            for(int j=2; j<i; j++){
                if(i%j==0){
                    System.out.print(i+" ");
                    break;
                }
                }
            }
            System.out.print("\nPrime numbers:");
            for(int i=a; i<=b; i++){
                for(int j=2; j<i; j++){
                    if(i%j!=0){
                        System.out.print(i+" ");
                        break;
                    }
                    }
                }*/
                int[] arr = {1,2,3,4,5,6,7,8,9};
                int len = arr.length;
                for(int i=0; i<len; i++){
                    System.out.println(arr[i]+" "+arr[i]*arr[i]+" ");
                }

        }
    }

    
