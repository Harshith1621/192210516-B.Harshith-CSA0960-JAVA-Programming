package vscode.Medium_Level;

import java.util.*;
public class _02_Mth_maximum_Nth_minimum_sim_diff_In_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {14,16,87,36,25,89,34};
        int len =arr.length;
        for(int i=0; i<len; i++){
            for(int j=i+1; j<len; j++){
                if(arr[i]>arr[j]){
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0; i<len; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.print("\nEnter M value:");
        int a = sc.nextInt();
        int maximum = arr[len-a];
        System.out.print(a+"th maximum value:"+maximum);
        System.out.print("\nEnter N value:");
        int b =sc.nextInt();
        int minimum = arr[b-1];
        System.out.print(b+"th minimum value:"+minimum);
        System.out.print("\nSum:"+(maximum+minimum));
        System.out.print("\nDifference:"+(maximum-minimum));
    }
    
}
