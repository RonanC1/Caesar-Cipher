package com.Projects;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //get a string
        System.out.println("Input text: ");
        Scanner input2 = new Scanner(System.in);
        String word = input2.nextLine();
        //get number to change by
        System.out.println("Number to change text: ");
        Scanner input = new Scanner(System.in);
        int cypher = input.nextInt();
        String output = ceaserCypher(word, cypher);//use function to change
        //output the string
        System.out.printf("%s, with a key of %d, changes to %s\n", word, cypher, output);
    }

    public static String ceaserCypher(String word, int cypher)
    {
        int i = 0;
        String output = "";
        int numHolder = 0;
        char charHolder = 'a';
        //access each character with a for loop
        for(i = 0; i < word.length(); i++)
        {
            //if upper case
            if(Character.isUpperCase(word.charAt(i)))
            {
                //bring to zero scale by subtracting 65
                //add change number to character
                //mod by 26
                //add 65 back in
                numHolder = ((((int)word.charAt(i) - 65) + cypher)%26)+65;
                charHolder = (char)numHolder;
            }
            //if lower case
            else if(Character.isLowerCase(word.charAt(i)))
            {
                //add change number to character
                numHolder = ((((int)word.charAt(i) - 97) + cypher)%26)+97;
                charHolder = (char)numHolder;
            }
            else
            {
                //if special character
                //charHolder == the character at i
                charHolder = word.charAt(i);
            }
            //add to new string
            output = output + charHolder;
        }
        return output;
    }

}
