package stringPackage;

import java.util.ArrayList;
import java.util.HashSet;

public class StringDuplicate2 {

        public static void main(String[] args) {
            ArrayList<String> name = new ArrayList<>();
            name.add("Sumaia");
            name.add("Fayza");
            name.add("Sumaia");
            for(int i=0; i<name.size();i++){
                System.out.println(name.get(i));
            }
            HashSet<String> set2 = new HashSet<>(name);
            System.out.println(set2);
        }
    }
