package Programs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;

public class readTheDataFromTextFileAndStoredIntoMap {

    public static void main(String[] args) {

        Map<String, String> map= new HashMap<>();

        BufferedReader bufferedReader= null;

        try{
            File file = new File("");

            bufferedReader= new BufferedReader(new FileReader(file));

            String line =null;

            while ((line=bufferedReader.readLine())!=null){

                String[] values=line.split(":");
                String name =values[0].trim();
                String pwd = values[1].trim();

                if(!name.equals("") && !pwd.equals("")){
                    map.put(name,pwd);
                }
            }
        }
        catch (Exception exception){
            exception.printStackTrace();
        }
    }
}
