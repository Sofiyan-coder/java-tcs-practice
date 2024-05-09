
/*
TCS - NQT - YOP 2024 

        Check element in linkedlist are Armstrong number 

        input:
        12 34 153 2 1

        output:
        153

        input:
        12  756 42 232 4

        output:
        No Armstrong number present

*/

import java.util.LinkedList;
import java.util.Scanner;

public class ArmStrong {

    public static double digits(int num){
       int d=0;
        while(num != 0){

           d++;
           num/=10; 
            
        }
        return d;
    }

    public static boolean isArmStrong(int num){
            int n=num;
            double res=0;

        
            

            while(num != 0){

                int rem = num%10;

                res = res + (int) Math.pow(rem,digits(n));
                num/=10;

                
                
            }


        return (n == res)?true:false;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        LinkedList<Integer> list = new LinkedList<>();
        LinkedList<Integer> res = new LinkedList<>();
        System.out.println("Enter element spaces separated");
        String input=sc.nextLine();
        String[] elements = input.split(" ");
     
       for (String ele : elements) {

        list.add(Integer.parseInt(ele));
        
       }
    //    System.out.prin?tln(list);

      for (Integer ele : list) {

        if (isArmStrong(ele)) {

            res.add(ele);


            
        }
      
        
      }

      if (!res.isEmpty()) {

            System.out.println(res);
        
      } else {

        System.out.println("No Armstrong number present");
        
      }

        // System.out.println(isArmStrong(153));
        // System.out.println(Math.pow(2, 3));
        
    }
    
}
