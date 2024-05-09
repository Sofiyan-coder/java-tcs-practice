/* Find a taken String is a keyword or not
 * Note : 
 * "break", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range","return", 
   "struct", "type", "var" --- these are the keywords
 */

import java.util.Scanner;

public class KeywordOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter input");
        String in = sc.nextLine();
        String[] keywords = {"break","null", "case", "continue", "default", "defer", "else", "for", "func", "goto", "if", "map", "range","return", 
        "struct", "type", "var"};

        int next = 0;

        for (int i = 0; i < keywords.length; i++) {

            if (keywords[i].equalsIgnoreCase(in)) {

                System.out.println("keyword");
                break;
                
            } else {

                next++;
                
            }
            
        }
            if(next == keywords.length){
                System.out.println("Not a Keyword");
            }

        



    
    }
}
