package Programs;

import java.util.ArrayList;
import java.util.List;

//Removing element using List[Integer Array]
public class Removing_Element_List
{
    static void removeElement()
    {
        List<Integer> list=new ArrayList<Integer>();
        list.add(1);
        list.add(10);
        list.add(22);
        list.add(13);
        list.add(4);
        System.out.println(list);
        list.remove(2);
        System.out.println(list);
//        list.remove(10);
        list.remove((Integer)10);
        System.out.println(list);
    }
    public static void main(String[] args)
    {
        removeElement();
    }
}
