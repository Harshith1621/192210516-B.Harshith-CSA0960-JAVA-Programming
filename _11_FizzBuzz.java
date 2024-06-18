package vscode.Hard_Level;

import java.util.*;
//import java.util.ArrayList;
//import java.util.List;
public class _11_FizzBuzz {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n:");
        int n = sc.nextInt();
        //create array list
        List<String> x = new ArrayList<>();

        //String[] arr = new String[n];
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                x.add("FizzBuss ");
            }else if(i%3==0){
                x.add("Fizz ");
            }else if(i%5==0){
                x.add("Buzz ");
            }else{
                String a = Integer.toString(i);
                x.add(a);
            }
        }
       System.out.println(x);
    } 
}
