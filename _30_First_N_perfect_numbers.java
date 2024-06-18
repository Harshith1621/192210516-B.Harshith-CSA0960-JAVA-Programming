package vscode.Easy_Level;

import java.util.*;
public class _30_First_N_perfect_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N value:");
        int num = sc.nextInt();
        int count = num;
        int x=0;
        while(count>x){
            for(int i =1; i<Integer.MAX_VALUE; i++){
                int sum=0;
                for(int j=1; j<i; j++){
                    if(i%j==0){
                        sum+=j;
                    }
                }
                if(sum==i){
                    System.out.print(i+" ");
                    x+=1;
                }
            if(count==x){
                break;
            }
        }

    }    
    }
}
