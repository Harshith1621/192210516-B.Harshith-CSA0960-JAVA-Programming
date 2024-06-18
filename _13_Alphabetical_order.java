package vscode.Easy_Level;


import java.util.Scanner;
public class _13_Alphabetical_order {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    int n;
    System.out.print("Enter the number of strings:");
    n=sc.nextInt();
    sc.nextLine();

    String arr[] = new String[n];

    for(int i=0; i<n; i++){
        arr[i] = sc.nextLine();
    }
    System.out.println("Given Array:");
    for(int i=0; i<n; i++){
        System.out.print(arr[i]+" ");
    }
    for(int i=0; i<n; i++){
        for(int j=i+1; j<n; j++){
            if(arr[i].compareTo(arr[j])>0){
                String temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }

        }
    }
    System.out.println();
        System.out.println("Array in alphabetical order:");
        for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");

        }
    }
}
