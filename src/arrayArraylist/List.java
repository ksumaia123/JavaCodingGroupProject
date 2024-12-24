package arrayArraylist;

import java.util.ArrayList;
import java.util.Collections;

public class List {



        public static void main(String[] args) {
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list, 2,4,2,5,7,45,67,23,78,79,55);
            System.out.println("Original List: " +list);
            ArrayList<Integer> ascendingList = new ArrayList<>(list);
            Collections.sort(ascendingList);
            System.out.println("Ascending ordr:" +ascendingList);

            ArrayList<Integer> descendingList = new ArrayList<>(list);
            descendingList.sort(Collections.reverseOrder());
            System.out.println("Descending order:" +descendingList);

            int largest = Collections.max(list);
            int smallest = Collections.min(list);
            System.out.println("Largest number:" +largest);
            System.out.println("Smallest number:"+smallest);
            // Synthax for xpath
            //tagname[contains(attribute)]



        }
    }

