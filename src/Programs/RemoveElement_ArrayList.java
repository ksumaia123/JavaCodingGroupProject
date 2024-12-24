package Programs;

import java.util.ArrayList;
import java.util.List;

//Removing element from Array using List[Character array]
public class RemoveElement_ArrayList
{
    static void remove()
    {
        List<Character> list=new ArrayList<Character>();
        list.add('N');
        list.add('e');
        list.add('e');
        list.add('l');
        list.add('i');
        list.add('m');
        list.add('a');
        System.out.println(list);
        list.remove(5);
        System.out.println(list);
//        list.remove('a');//Exception-IndexOutOfBoundException Index-97
        list.remove((Character)'a');
        System.out.println(list);
    }
    public static void main(String[] args)
    {
        remove();
    }
}
