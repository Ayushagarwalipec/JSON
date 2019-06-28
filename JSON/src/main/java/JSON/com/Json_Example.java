package JSON.com;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Example 
{
    public static void main( String[] args ) throws IOException, ParseException
    {
        FileReader file = new FileReader("src/main/resources/JSON-Example.json");
        JSONParser parser = new JSONParser();
        JSONObject json= (JSONObject) parser.parse(file);
        System.out.println(json);
        String FN = json.get("firstName").toString();
        System.out.println(FN);
        String add = json.get("address").toString();
        System.out.println(add);
        JSONObject js =(JSONObject) json.get("address");
        String city = js.get("city").toString();
        System.out.println(city);
        JSONArray phno = (JSONArray)json.get("phoneNumbers");
        for(int i=0 ; i<phno.size();i++)
        {    System.out.println(phno.get(i));
        
        }
        System.out.println(phno.get(1));
//        Iterator i = phno.iterator();
//        while (i.hasNext()) {
//            JSONObject innerObj = (JSONObject) i.next();
//            System.out.println(innerObj.get("number") + innerObj.get("type"));
//        }
        
    }
}
