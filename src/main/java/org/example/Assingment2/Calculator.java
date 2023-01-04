package org.example.Assingment2;
import java.util.Scanner;

public class Calculator {
    public enum Operations
    {
        SUM, DIFFERENCE, MULTIPLICATION, DIVISION;
    }
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number");
        int a = sc.nextInt();

        System.out.println("Enter the operation");
        String operationStr = sc.next();
        Operations operation = Operations.valueOf(operationStr);

        System.out.println("Enter the second number");
        int b = sc.nextInt();

        int result = 0;

        switch (operation){
            case SUM:  result = a+b;
                break;
            case DIFFERENCE: result = a-b;
                break;
            case MULTIPLICATION: result = a * b;
                break;
            case DIVISION: if( b == 0){
                System.out.println("division by 0 is not available");
            }
            else{
                result = a/b;
            }
                break;
            default:break;
        }
        System.out.println("result  : "+ result);
    }
}
