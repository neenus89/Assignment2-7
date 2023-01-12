package org.example.Assignment4;

import java.util.*;

public class Shape {

    static  float volume( int side) {
        return side * side * side;
    }

    static float volume(int length, int width, int height){
        return length * width * height;
    }

    static double volume(int height, int radius) {
        return (3.14 * radius * radius * height)/3;
    }

    public static void main(String [] args){
        System.out.println("Enter radious of circle");
        Scanner sc = new Scanner(System.in);
        int radius = sc.nextInt();
        System.out.println("Volume"+volume(radius));

        System.out.println("Enter length of cuboid");
        int length = sc.nextInt();
        System.out.println("Enter width of cuboid");
        int width = sc.nextInt();
        System.out.println("Enter height of cuboid");
        int height = sc.nextInt();
        System.out.println("Volume"+volume(length, width, height));

        System.out.println("Enter radius of cone");
        radius = sc.nextInt();
        System.out.println("Enter height of height");
        height = sc.nextInt();
        System.out.println("Volume"+volume(height,radius));
    }
}
