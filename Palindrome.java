/*Write a program to check if a given string is a valid palindrome, considering only alphanumeric characters and ignoring cases.
A palindrome is a word, phrase, number, or other sequence of characters that reads the same forward and backward.

Your program should return True if the input string is a valid palindrome, and False otherwise.

For example, if the input string is "A man, a plan, a canal: Panama", the program should return True, as the string is a 
valid palindrome when considering only alphanumeric characters ("amanaplanacanalpanama").

Write a program that takes a string as input and determines whether it is a valid palindrome or not, considering alphanumeric 
characters and ignoring cases. 

Sample input: "A man, a plan, a canal: Panama"
Sample output: True

Sample input: "hello world"
Sample output: False
*/

import java.util.Arrays;
import java.util.Scanner;
public class Palindrome {

    public static void main(String[] args) {
        System.out.println("Enter String");
        Scanner in = new Scanner(System.in);
        String s= in.nextLine().toLowerCase();
        char[] ch = new char[0];

        for (int i = 0; i < s.length(); i++) {
                // if(Character.isLetter(s.charAt(i)))
                // {
                    ch = Arrays.copyOf(ch, ch.length+1);
                    ch[ch.length-1] = s.charAt(i);

                
        }

        boolean check = true;
        // System.out.println(Arrays.toString(ch));
        for (int i = 0; i < ch.length; i++) {
            if(ch[i] != ch[ch.length-1-i]){
                check = false;
                break;
            }
        }
        if (check) {

            System.out.println("True");
            // System.out.println(Arrays.toString(ch));
            
        } else {

            System.out.println("False");
            
        }

    }

     
}
    

