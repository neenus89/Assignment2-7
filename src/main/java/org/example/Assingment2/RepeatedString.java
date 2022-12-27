package org.example.Assingment2;
import java.lang.*;

public class RepeatedString {
    /**
     * print the repeated words in a string
     * @param args
     * @author: neenu s
     * @since 27-12-2022
     */
    public static void main(String [] args){
        String s = "I am am learning java programming";

        //split the string to word array
        String words[] = s.split(" ");

        //initializing repeated string array
        String[] repeated = new String[words.length];
        int num = 0;
        //iterating the words in sentence
        for(int i = 0; i < words.length; i++){
            for(int j = i+1; j < words.length; j++){

                //checking each word with other words
                if(words[i].equals(words[j])){
                    repeated[num] = words[i];
                    num ++;
                }
            }
        }
        //printing the word that is repeated
        for (String rep: repeated) {
            if(rep != null)
                System.out.println(rep);
        }
    }
}
