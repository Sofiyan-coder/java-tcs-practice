/*Write a program to check if two strings are anagrams of each other. An anagram is a word or phrase formed by rearranging 
the letters of another word or phrase. Your program should return True if the two input strings are anagrams, and False 
otherwise.

For example, if the input strings are "listen" and "silent", the program should return True, as both strings can be rearranged 
to form the same letters.

Write a program that takes two strings as input and determines whether they are anagrams or not.

Sample input1:
----------------
listen
silent

Sample output1:
---------------
True

Sample input2:
---------------
hello
world

Sample output2:
---------------
False

*/

import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {
        Scanner sc = new  Scanner(System.in);
        System.out.println("ENter Str 1");
        String str1 = sc.nextLine();
        char[] ch1 = str1.toCharArray();

        System.out.println("ENter Str 2");
        String str2 = sc.nextLine();
        char[] ch2 = str1.toCharArray();

            int check = 0;
        for (int i = 0; i < ch1.length; i++) {
            for (int j = 0; j < ch2.length; j++) {

                if(ch1[i] == ch2[j]){


                        check++;
                        break;
                }
                
            }
            
        }

        if (ch1.length == ch2.length && check == ch1.length) {

            System.out.println("true");
            
        } else {
            System.out.println("false");
        }

    }

}
