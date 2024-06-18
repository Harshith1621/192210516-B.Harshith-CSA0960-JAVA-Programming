package vscode.Easy_Level;

import java.util.*;
public class _33_Number_of_composite_element_in_array {
    public static void main(String[] args){
        int[] a = {2,3,4,5,6,7,8,9,10};
        int count = 0;
        int len =a.length;
        System.out.print("Composite numbers:");
        for(int i=0; i<len; i++){
            int c=0;
            for(int j=1; j<=a[i]; j++){
                if(a[i]%j==0){ 
                    c+=1;
                }
                if(c>2){
                    System.out.print(a[i]+" ");
                    break;
                }
            }
            if(c>2){
                count+=1;
            }
        }
        System.out.print("\nNumber of composite numbers:"+count);
    }  
}
