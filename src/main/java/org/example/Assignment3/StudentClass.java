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
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rollno");
        int roll = sc.nextInt();
        s.setRollno(roll);

        System.out.println("Enter name of student");
        String name = sc.next();
        s.setName(name);

        System.out.println("Enter address of student");
        String address = sc.next();
        s.setAddress(address);

        System.out.println("Enter marks of 5 subjects");
        int [] mark = new int[5];
        for(int i=0; i < 5; i++) {
            mark[i] = sc.nextInt();
        }
        s.setMark(mark);


        s.grade = s.gradeCalculation(s.getMark());
        System.out.println("roll no : "+s.getRollno());
        System.out.println("name : "+s.getName());
        System.out.println("address : "+s.getAddress());
        for (int i : s.getMark()) {
            System.out.println(i);
        }
        System.out.println("Grade : "+s.grade);
    }


    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setMark(int[] mark) {
        this.mark = mark;
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
