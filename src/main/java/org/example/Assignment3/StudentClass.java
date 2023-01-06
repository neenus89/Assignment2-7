package org.example.Assignment3;
import java.util.Scanner;

/**
 * student class program to calculate marks and print details of student
 * @author neenu s
 * @since 06-01-2023
 */
public class StudentClass {
    int rollno;
    String name, address;
    int [] mark = new int[5];
    char grade;

    /**
     * main function
     * @param args
     * @return void
     */
    public static void main(String [] args){
        StudentClass s = new StudentClass();
        s.getData();

        s.grade = s.gradeCalculation(s.mark);
        System.out.println("Grade :"+s.grade);

        s.showData();
    }

    /**
     * get details of student
     * @return void
     */
    public void getData(){
        System.out.println("Enter rollno");
        Scanner sc = new Scanner(System.in);
        rollno = sc.nextInt();

        System.out.println("Enter name of student");
        name =sc.next();

        System.out.println("Enter address of student");
        address = sc.next();

        System.out.println("Enter marks of 5 subjects");
        for(int i=0; i < 5; i++){
            mark[i] = sc.nextInt();
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

    /**
     * show all data of student
     */
    public void showData(){
        System.out.println("Roll number : "+rollno);
        System.out.println("Name of student :"+name);
        System.out.println("Address of student :"+address);
        System.out.println("Marks of student : ");
        for (int i:mark) {
            System.out.println(i);
        }
        System.out.println("Grade of student : "+grade);
    }
}
