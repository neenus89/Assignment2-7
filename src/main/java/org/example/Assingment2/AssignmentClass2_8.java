package org.example.Assingment2;
import java.util.*;

/**
 * AssignmentClass2_8 will print the number of spaces, characters and digits in a string
 * @author: neenu s
 * @since 27-25-2022
 */
public class AssignmentClass2_8 {
    public static void main(String [] args){

        //fetching a string for counting
        System.out.println("Enter a string: ");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int space = 0,digit = 0, alpha = 0, other = 0;

        //checking each characters in string
        for (int i =0; i < s.length(); i++) {
            //check the character is space
           if(Character.isWhitespace(s.charAt(i))){
               space ++;
               //check the character is digit
           } else if (Character.isDigit(s.charAt(i))) {
               digit ++;
               //check the character is alphabet
           } else if (Character.isAlphabetic(s.charAt(i))) {
               alpha ++;
               //check the character is other characters
           } else{
               other ++;
           }
        }
        //printing all the counts
        System.out.println("Number of spaces : "+space);
        System.out.println("Number of digits : "+digit);
        System.out.println("Number of alphabets : "+alpha);
        System.out.println("Number of other elements : "+other);
    }
}
