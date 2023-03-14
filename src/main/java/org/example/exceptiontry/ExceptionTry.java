package org.example.exceptiontry;


class MyException extends Exception {
    String str1;
    MyException(String str2) {
        str1 = str2;
    }
    public String toString() {
        return ("My exception occurred"+str1);
    }
}
public class ExceptionTry {
    public static void main(String args[]) {
        try{
            System.out.println("Start of try block");
            throw new MyException("Error Message");
        }
        catch(MyException exp){System.out.println("Catch Block");
            System.out.println(exp);
        }
    }

}
