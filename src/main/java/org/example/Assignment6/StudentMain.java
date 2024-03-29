package org.example.Assignment6;

import org.example.Assignment3.StudentClass;

import java.util.Scanner;

public class StudentMain {

    int roll_no, id, age;
    String name = new String();
    char grade;

    public void registerForScholership(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter roll number");
        this.roll_no= sc.nextInt();

        System.out.println("Enter id");
        this.id = sc.nextInt();

        System.out.println("Enter age");
        this.age = sc.nextInt();

        System.out.println("Enter name");
        this.name = sc.next();

        System.out.println("Enter grade");
        this.grade = sc.next().charAt(0);
        try {
            if (age < 10) {
                throw new EligibilityCriteria("Age less than 10");
            }
            if(grade == 'E' || grade == 'F' || grade == 'D') {
                throw new EligibilityCriteria("Grade is not eligible");
            }

        }
        catch (EligibilityCriteria e){
            System.out.println(e);
        }
    }

    public static void main(String args[]){
        StudentMain sc = new StudentMain();
        sc.registerForScholership();
    }
}

class EligibilityCriteria extends Exception {
    String msg;
    EligibilityCriteria(String msg) {
        this.msg=msg;
    }
    public String toString(){
        return ("Status  = "+msg) ;
    }
}