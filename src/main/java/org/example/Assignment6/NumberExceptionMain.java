package org.example.Assignment6;

import java.util.Scanner;

public class NumberExceptionMain {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");

        int num = sc.nextInt();
        NumberExceptionMain obj = new NumberExceptionMain();
        try{
            obj.check(num);
        }
        catch (ArithmeticException e){
            System.out.println(e);
        }

    }

    public void check(int num) {
        if (num > 999) {
            throw new ArithmeticException("Excceds 999");
        }
    }
}


