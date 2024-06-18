package vscode.Medium_Level;

import java.util.*;
class A extends Thread{
    private int n;
    public A(int n){
        this.n=n;
    }
    public void run(){
        for(int i=0;i<=n;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }
    }
}
class B extends Thread{
    private int n;
    public B(int n){
        this.n=n;
    }
    public void run(){
  
        for(int i=0;i<=n;i++){
            System.out.println(n+" X "+i+" = "+(n*i));
        }

    }

}
public class _22_Mutltiplication_table_using_various_threads {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n1 =sc.nextInt();
        int n2 = sc.nextInt();
        A threadA = new A(n1);
        //System.out.println("______________");
        B threadB = new B(n2);
        threadA.start();
        //System.out.println("______________");
        threadB.start();
    }
    
}
