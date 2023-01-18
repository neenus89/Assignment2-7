package org.example.Assignment4;
import java.util.Scanner;

public class Employee {
    int id;
    String name, address;

    void salary() {
       System.out.println("Salary for employee");
    }

    void workingHour() {
        System.out.println("Working hour for employee");
    }
}

class JuniorDeveloper extends Employee {
    void salary() {
        System.out.println("Salary for junior developer");
    }

    void workingHour() {
        System.out.println("Working hour for junior developer");
    }
}

class TeamLeader extends Employee {
    void salary() {
        System.out.println("Salary for team leader");
    }

    void workingHour() {
        System.out.println("Working hour for team leader");
    }
}

class ProjectManager extends Employee {
    void salary() {
        System.out.println("Salary for team project manager");
    }

    void workingHour() {
        System.out.println("Working hour for project manager");
    }
}

class MainEmployee {

    public static void main(String [] args){
        JuniorDeveloper jr = new JuniorDeveloper();
        TeamLeader tl = new TeamLeader();
        ProjectManager pm = new ProjectManager();
        jr.salary();
        jr.workingHour();
        tl.salary();
        tl.workingHour();
        pm.salary();
        pm.workingHour();
    }




}
