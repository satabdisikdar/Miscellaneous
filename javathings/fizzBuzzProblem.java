/*
Problem statement:
Program to print numbers in the given range. For multiples of 3 print "Fizz" instead of the number and for multiples of 5 print "Buzz". 
For numbers which are multiples of both 3 and 5 print "FizzBuzz".

Input format: First line will be no. of testcases T. Next line will have T integers, denoted by N.

Output format: For each testcase, print numbers from 1 to N. N is an integer 
Constraint: 1 <=T<= 10
(abide by the problem statement)

Sample input-
2
3 15

Expected Output-
1 2 Fizz 1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz
*/

import java.util.*;

class fizzBuzzProblem {
    public static void main(String args[] ) throws Exception {
      try{
        Scanner s = new Scanner(System.in);
        System.out.println("Give number of test cases: ");
        int t = s.nextInt();
        System.out.println("Give inputs equal to number of test cases: ");
        int[] term= new int[t];
        for(int i=0; i<t; i++){
            term[i]= s.nextInt();
        }
         for(int y=0;y<term.length; y++){
            for(int i=1; i<=term[y]; i++){

            if(i%3==0 && i%5==0){
               System.out.print("FizzBuzz ");
            }
            else if(i%3==0){
               System.out.print("Fizz ");
            }
            else if(i%5==0){
               System.out.print("Buzz ");
            }
            else{
               System.out.print(i+ " ");
            }
         }           
      }
   }
   catch(Exception e){
      e.printStackTrace();
   }
   finally{
      System.out.println("Done!");
   }    
}
}
