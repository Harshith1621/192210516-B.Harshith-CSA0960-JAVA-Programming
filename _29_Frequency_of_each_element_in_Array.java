package vscode.Easy_Level;

import java.util.*;
public class _29_Frequency_of_each_element_in_Array {
    public static void main(String args[]){
        int[] a = {1,2,8,3,2,2,2,5,1};
        int n = a.length;
        int[] b=new int[n];
        int visited = -1;
        for(int i=0; i<n; i++){
            int count=1;
            for(int j=i+1; j<n; j++){
                if(a[i]==a[j]){
                    count+=1;
                    b[j]=visited;
                }
            }
            if(b[i]!=visited){
                b[i]=count;
            }
        }
        System.out.println("Ele - Fre");
        for(int i=0; i<n; i++){
            if(b[i]!=visited){
                System.out.println(a[i]+"     "+b[i]);
            }
        }

        
    }
    
}
