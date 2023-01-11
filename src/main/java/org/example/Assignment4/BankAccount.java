package org.example.Assignment4;

import java.util.*;

public class BankAccount {
    String accNumber;
    int balance , rate;

   private class AccountBalance {
       public float currentBalance() {

           System.out.println("Enter balance");
           Scanner sc = new Scanner(System.in);
           balance = sc.nextInt();

           System.out.println("Enter account number");
           accNumber = sc.next();
           System.out.println("Enter rate");
           rate = sc.nextInt();
           balance = balance + (balance * rate) / 100;
           return balance;
       }
   }

   void call_inner() {
       AccountBalance bal = new AccountBalance();
       bal.currentBalance();
   }

}

class Main {
    public static void main(String [] args){
        BankAccount bank_account = new BankAccount();

        bank_account.call_inner();
        System.out.println("Account Number "+bank_account.accNumber);
        System.out.println("Rate "+bank_account.rate);
        System.out.println("Current balance "+bank_account.balance);
    }
}

