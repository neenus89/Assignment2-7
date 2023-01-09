package org.example.Assignment3;
import java.util.Scanner;

/**
 * student class program to calculate marks and print details of student
 * @author neenu s
 * @since 06-01-2023
 */
public class StudentClass {

    char grade;
    int rollno;
    String name, address;
    int [] mark = new int[5];

    Scanner sc = new Scanner(System.in);


    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int[] getMark() {
        return mark;
    }

    /**
     * main function
     * @param args
     * @return void
     */
    public static void main(String [] args){
        StudentClass s = new StudentClass();
        System.out.println("Enter rollno");
        s.setRollno();

        System.out.println("Enter name of student");
        s.setName();

        System.out.println("Enter address of student");
        s.setAddress();

        System.out.println("Enter marks of 5 subjects");
        s.setMark();


        s.grade = s.gradeCalculation(s.getMark());
        System.out.println("roll no : "+s.getRollno());
        System.out.println("name : "+s.getName());
        System.out.println("address : "+s.getAddress());
        for (int i : s.getMark()) {
            System.out.println(i);
        }
        System.out.println("Grade : "+s.grade);
    }


    public void setRollno() {
        this.rollno = sc.nextInt();
    }

    public void setName() {
        this.name = sc.next();
    }

    public void setAddress() {
        this.address = sc.next();
    }

    public void setMark() {
        for(int i=0; i < 5; i++) {
            this.mark[i] = sc.nextInt();
        }
    }

    /**
     * calculation of mark and get grade
     * @param mark
     * @return grade
     */
    public char gradeCalculation(int [] mark){
        int sum = 0;
        for (int i:mark) {
            sum = sum+i;
        }
        int average = sum/5;

        if(average > 40){
            return 'A';
        }
        else if(average > 30 && average <40){
            return 'B';
        }
        else {
            return 'C';
        }
    }


}
