package vscode.Hard_Level;

import java.util.*;
public class _18_Number_of_steps_to_Zero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int step=0;
        while(num>0){
            if(num%2==0){
                num/=2;
                step+=1;
            }else{
                num-=1;
                step+=1;
            }
            if(num==0){
                break;
            }
        }
        System.out.println("Number of steps:"+step);        
    }
}
