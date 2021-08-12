package javathings;

import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class jsonToMap {
    public static void main(String[] args) {
        Map<String, Object> map = new HashMap<>();
        try {
            Object obj = new FileReader("/home/abc/Documents/miscellaneous/Miscellaneous/javathings/test2.json");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
