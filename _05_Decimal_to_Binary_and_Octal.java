package vscode.Medium_Level;

import java.util.*;
public class _05_Decimal_to_Binary_and_Octal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter decimal number:");
        int dec = sc.nextInt();
        String binary = Integer.toBinaryString(dec);
        String octal = Integer.toOctalString(dec);
        System.out.print("Binary number:"+binary);
        System.out.print("\nOctal number:"+octal);
        

        //Without INBUILT methods
        /*System.out.print("Enter decimal number:");
        int dec = sc.nextInt();
        String x = convertBinary(dec);
        String y = covertOctal(dec);
        System.out.println("Binary number:"+x);
        System.out.println("Octal number:"+y);
    }

    static String convertBinary(int a){
        StringBuilder bin = new StringBuilder();
        while(a>0){
            int rem = a%2;
            bin.append(rem);
            a/=2;
        }
        return bin.reverse().toString();

    }//decimal to octal
    static String covertOctal(int a){
        StringBuilder oct = new StringBuilder();
        while(a>0){
            int rem = a%8;
            oct.append(rem);
            a/=8;
        }
        return oct.reverse().toString();*/
    }
}
