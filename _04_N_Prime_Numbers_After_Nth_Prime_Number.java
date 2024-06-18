package vscode.Hard_Level;

import java.util.*;
public class _04_N_Prime_Numbers_After_Nth_Prime_Number {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value:");
        int n = sc.nextInt();
        int count=0;
        int[] arr = new int[n*2];
        for(int i=1;i<Integer.MAX_VALUE;i++){
            int c =0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    c++;
                }
            }
            if(c==2){
                arr[count]=i;
                //System.out.print(arr[count]+" ");
                count++;
            }
            if(count==n*2){
                break;
            }
           // break;
        }
        //System.out.print(count);
        System.out.println(n+"th Prime number:"+arr[n-1]);
        for(int i=count/2;i<count;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
