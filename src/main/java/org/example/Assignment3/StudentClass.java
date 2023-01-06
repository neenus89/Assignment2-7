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

    public StudentClass(int rollno, String name, String address, int[] mark) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
        this.mark = mark;
    }

    /**
     * main function
     * @param args
     * @return void
     */
    public static void main(String [] args){
        System.out.println("Enter rollno");
        Scanner sc = new Scanner(System.in);
        int rollno = sc.nextInt();

        System.out.println("Enter name of student");
        String name =sc.next();

        System.out.println("Enter address of student");
        String address = sc.next();

        System.out.println("Enter marks of 5 subjects");
        int [] mark = new int[5];
        for(int i=0; i < 5; i++){
            mark[i] = sc.nextInt();
        }

        StudentClass s = new StudentClass(rollno,name,address,mark);
        s.grade = s.gradeCalculation(mark);
        s.showData();
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

    /**
     * show all data of student
     */
    public void showData(){
        System.out.println("Roll number : "+this.rollno);
        System.out.println("Name of student :"+this.name);
        System.out.println("Address of student :"+this.address);
        System.out.println("Marks of student : ");
        for (int i:this.mark) {
            System.out.println(i);
        }
        System.out.println("Grade of student : "+this.grade);
    }
}
