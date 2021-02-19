/*
Problem:
Bob's crush's name starts with a vowel. That's the reason Bob loves vowels too much. 
He calls a string "lovely string" if it contains either all the lowercase vowels or all the uppercase vowels or both, else he calls that string "ugly string". 

Input:
First line contains T, the number of test cases.
Next T lines contain a single string S each.

Output: For each test case, print "lovely string" or "ugly string" (without quotes) according to the definition of Bob.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
public class ohMaaGoTuruLob {
    public static void main(String args[] ) throws Exception{
        try{

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Number of testcases: ");
            int testcases= Integer.parseInt(br.readLine());
            String[] str=new String[testcases];
            System.out.println("Give string inputs: ");
            for(int i = 0; i<testcases; i++){
                str[i]= br.readLine(); 
            }
            for(int i=0; i<str.length; i++){
                int lower=0, upper=0;
                for(int j=0; j<str[i].length(); j++){

                    if(str[i].charAt(j)== 'A' || str[i].charAt(j)== 'E' || str[i].charAt(j)== 'I' || str[i].charAt(j)== 'O' || str[i].charAt(j)== 'U'){
                        upper++;
                    }
                    if(str[i].charAt(j)== 'a' || str[i].charAt(j)== 'e' || str[i].charAt(j)== 'i' || str[i].charAt(j)== 'o' || str[i].charAt(j)== 'u'){
                        lower++;
                    }

                }
                if((upper>=5 && lower>=5) || (upper>=5 || lower>=5)){
                    System.out.println("lovely string");
                }
                else{
                    System.out.println("ugly string");
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
