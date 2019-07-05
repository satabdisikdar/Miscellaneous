
class JsonEncodeDemo {
   public static void main(String[] args) { 
      String s = "((((abc)))))";
      int count1 = 0, count2 =0;
      while(s.contains("(")){
         count1++;
      }
      while(s.contains(")")){
         count2 ++;
      }
      if(count1 == count2){
         System.out.println("string in the middle!");
      }
      else
         System.out.println("failed!");

   }
}
