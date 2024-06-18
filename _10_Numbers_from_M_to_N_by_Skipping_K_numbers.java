package vscode.Easy_Level;


import java.util.Scanner;
public class _10_Numbers_from_M_to_N_by_Skipping_K_numbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter M value:");
        int m = sc.nextInt();
        System.out.println("Enter N value: ");
        int n =sc.nextInt();
        System.out.println("ENter K value:");
        int k =sc.nextInt();
        for(int i=m; i<=n; i=i+k+1){
            System.out.print(i+" ");

        }
    }
    
}
