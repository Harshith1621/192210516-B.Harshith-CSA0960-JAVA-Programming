package vscode.Easy_Level;


import java.util.Scanner;
public class _07_Pascal_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Enter the rows:");
        n = sc.nextInt();
        for(int i=1; i<=n; i++){
            int a =1;
            for(int k=n; k>i; k--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(a+" ");
                a=a*(i-j)/j;

            }
            System.out.println();
        }
    }
    
}
