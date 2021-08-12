//code to read properties file

package javathings;

import java.io.FileReader;
import java.util.Properties;

public class readProp {

    public static void main(String[] args)throws Exception
    {
        try{
            FileReader reader=new FileReader("./configuration.properties");  
      
            Properties prop=new Properties();  
            prop.load(reader);  
            System.out.println(prop.getProperty("company1"));
            
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
    
}
