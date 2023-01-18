package org.example.Assignment5;

import java.util.Scanner;

abstract class Shape {
    abstract void area();
    abstract void volume();
}

class Circle extends Shape {
    void area(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        double area = 3.14*radius*radius;
        System.out.println("Area of circle"+area);
    }

    void volume(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();
        double vol = 4.3 * 3.14 * radius *radius * radius;
        System.out.println("Volume of circle"+vol);
    }
}

class Rectangle extends Shape {
    void area(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        double area = 3.14*length*width;
        System.out.println("Area of rectangle"+area);
    }

    void volume(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();
        System.out.println("Enter width");
        int width = sc.nextInt();
        System.out.println("Enter height");
        int height = sc.nextInt();
        double vol =  length *height * width;
        System.out.println("Volume of rectangle"+vol);
    }
}

class Square extends Shape {
    void area(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");

        int length = sc.nextInt();
        double area = length*length;
        System.out.println("Area of square"+area);
    }

    void volume(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();

        double vol =  length *length * length;
        System.out.println("Volume of square"+vol);
    }
}

class Cube extends Shape {
    void area(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");

        int length = sc.nextInt();
        double area = length*length;
        System.out.println("Area of cube"+area);
    }

    void volume(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter length");
        int length = sc.nextInt();

        double vol =  length *length * length;
        System.out.println("Volume of cube"+vol);
    }
}

class Sphere extends Shape {
    void area(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter radius");

        int radius = sc.nextInt();
        double area = 4 * 3.14 * radius *radius;
        System.out.println("Area of cube"+area);
    }

    void volume(){
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter radius");
        int radius = sc.nextInt();

        double vol =  4/3 * 3.14 * radius * radius *radius;
        System.out.println("Volume of cube"+vol);
    }
}

class Main {
    public static void main(String [] args) {
        Shape s;
        s= new Circle();
        s.area();
        s.volume();

        s= new Rectangle();
        s.volume();
        s.area();

        s= new Square();
        s.area();
        s.volume();

        s= new Cube();
        s.volume();
        s.area();

        s= new Sphere();
        s.volume();
        s.area();

    }
}
