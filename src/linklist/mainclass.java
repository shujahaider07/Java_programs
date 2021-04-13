package linklist;

import java.util.*;

public class mainclass {


    public static void main(String[] args) {
        List<data> students = new LinkedList<>();
        students.add(new data("Shuja",49));
        students.add(new data("Zain ",14));
        students.add(new data("azim",16));



        data foo  = new data("azim",16);
        students.add(foo);
        students.remove(2);


        System.out.println(students);
        //System.out.println(Arrays.deepToString(students.toArray()));




    }




}
