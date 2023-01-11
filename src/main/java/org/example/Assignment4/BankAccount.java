package org.example.Assignment4;

import java.util.*;

public class BankAccount {
    String accNumber;
    int balance , rate;

   class AccountBalance {
       public float currentBalance(){

        System.out.println("Enter balance");
        Scanner sc= new Scanner(System.in);
        balance = sc.nextInt();

        System.out.println("Enter account number");
        accNumber = sc.next();
        System.out.println("Enter rate");
        rate = sc.nextInt();
        balance = balance + (balance*rate)/100;
        return  balance;
    }
   }

}

class Main {
    public static void main(String [] args){
        BankAccount bank_account = new BankAccount();
        BankAccount.AccountBalance account_balance = bank_account.new AccountBalance();
        account_balance.currentBalance();
        System.out.println("Account Number "+bank_account.accNumber);
        System.out.println("Rate "+bank_account.rate);
        System.out.println("Current balance "+bank_account.balance);
    }
}

