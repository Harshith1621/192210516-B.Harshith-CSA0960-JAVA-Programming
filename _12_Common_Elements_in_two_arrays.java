package vscode.Hard_Level;

import java.util.*;
public class _12_Common_Elements_in_two_arrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> x = new ArrayList<>();
        System.out.println("Enter size of 1st array:");
        int n1 = sc.nextInt();
        System.out.println("Enter the size of 2nd array:");
        int n2 = sc.nextInt();
        int[] a = new int[n1];
        int[] b = new int[n2];
        System.out.println("Enter the elements of first Array:");
        for(int i=0;i<n1;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("Enter the elements of second Array:");
        for(int j=0;j<n2;j++){
            b[j]=sc.nextInt();
        }
        if(n1>n2){
            for(int i=0;i<n1;i++){
                for(int j=0;j<n2;j++){
                    if(a[i]==b[j]){
                        x.add(a[i]);
                    }

                }
            }
            System.out.println("Common elements:");
            System.out.print(x);
        }else{
            for(int j=0;j<n2;j++){
                for(int i=0;i<n1;i++){
                    if(a[i]==b[j]){
                        x.add(a[i]);
                    }
                }
            }
            System.out.println("Common elements:");
            System.out.print(x);
        }
    }   
}
