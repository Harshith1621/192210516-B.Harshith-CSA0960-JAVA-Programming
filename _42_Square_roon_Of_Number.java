package vscode.Easy_Level;

import java.util.*;
import java.lang.Math;
public class _42_Square_roon_Of_Number {
    public static void main(String[] args){
        System.out.print("Enter number:");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double y = Math.sqrt(n);           //MATH FUNCTION WORKS ONLY ON THE DATATYPE 'DOUBLE'
        if(y == (int)y){
            int x =(int)y;
            System.out.println(x+" "+"-"+x);
        }else{
            System.out.println("Given number is not a perfect square");
        }
    }
}
