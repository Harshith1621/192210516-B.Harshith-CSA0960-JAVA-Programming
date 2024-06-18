package vscode.Hard_Level;

import java.util.*;
public class _07_Number_Square_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Lower range:");
        int a = sc.nextInt();
        System.out.print("Enter upper range:");
        int b = sc.nextInt();
        if(a<b){
            for(int i=a;i<=b;i++){
                System.out.print("("+i+", "+i*i+")"+" ");
            }
        }else{
            for(int i=a;i>=b;i--){
                System.out.print("("+i+", "+i*i+")"+" ");
            }
        }
    }
}
