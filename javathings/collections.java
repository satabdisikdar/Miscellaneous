//Program for Sorting HashMap by Values
import java.util.HashMap;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class collections {
    public static void main(String[] args) throws Exception {
        try{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            HashMap<Integer, String> hMap= new HashMap<Integer, String>();
            int terms= Integer.parseInt(br.readLine());
            System.out.println("Hashmap values: ");
            for(int i=1; i<=terms; i++){
                hMap.put(i, br.readLine());
            }
        
        }
        catch(Exception e){

        }
        finally{

        }
        

    }
    
}
