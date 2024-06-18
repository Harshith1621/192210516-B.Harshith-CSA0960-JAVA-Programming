package vscode.Hard_Level;

import java.util.*;
public class _08_Scenario_based {
    public static void main(String[] args) {
        Bank_Account bank = new Bank_Account();
        bank.Account_Details();
        bank.deposit(3000);
        bank.withdraw(1000);
        bank.display();

    }
}
class Bank_Account{
    String name;
    int Acc_No;
    String type;
    double bal;
    public Bank_Account(){
        this.bal = 1000;
    }
    //Method to read Account details
    void Account_Details(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Account Number:");
        Acc_No = sc.nextInt();
        System.out.print("Enter Accountant name:");
        name = sc.next();
        System.out.print("Enter Account type (S/C):");
        type =sc.next();
    }
    //Method to Deposit Amount
    void deposit(double amount){
        if(amount>0){
            bal+=amount;
            System.out.println("Amount deposited and New balance:"+bal);
        }else{
            System.out.println("Invalid Amount");
        }
    }
    void withdraw(double amount){
        if(amount>0 && amount<=bal){
            if(bal-amount>=500){
                System.out.print("Amount withdrawn and New Balance:"+bal);
            }else{
                System.out.println("Insufficient Balance");
            }
        }else{
            System.out.println("Invalid Amount");
        }
    }
    void display(){
        System.out.println("\nCurrent Balance:"+bal);
    }
}
