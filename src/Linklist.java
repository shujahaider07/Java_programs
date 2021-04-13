import java.util.ArrayList;
import java.util.*;
import java.util.Arrays;

public class Linklist {

    public static void main(String[] args) {

        ArrayList<Integer> al = new ArrayList<>();

        List<String> names = new LinkedList<>();


        HashMap<Integer,String> hashMap = new HashMap<>();
        hashMap.put(12,"material");
        System.out.println(hashMap);

         names.add("shuja");
         names.add("pakistan");
         names.add(1, "India");
         names.remove(1);
         names.add(2, "flowchart");
         System.out.println(names.get(2));

        System.out.println(names);

    }}

