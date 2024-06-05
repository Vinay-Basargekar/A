import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.LinkedList;
import java.util.List;

public class generic4 {
    public static void main(String args[]){
        ArrayList<Integer> list = new ArrayList<>();

        List<Integer> list1 = new LinkedList<>();

        Set<Integer> list2 = new HashSet<>();
        Set<Integer> list3 = new HashSet<>();


        list2.add(2122);
        list2.add(2342);
        list2.add(32143);
        list3.addAll(list2);
        System.out.println(list3);

        list.add(2);
        list.add(33);
        list.add(55);
        list1.add(1000);
        System.out.println(list + " " + list1);
        list.remove(0);
        System.out.println(list);
        System.out.println(list.get(0));

        System.out.println(list.size());

        System.out.println(list.toString());

    }
}
