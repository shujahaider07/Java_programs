import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Sorted {
    public static void main(String[] args) {

        int Arr[] = {12, 45, 7, 2, 32, 6, 8};


        ArrayList<Integer> al = new ArrayList<>();
        al.add(12);
        al.add(2);
        al.add(22);
        al.add(6);
        al.add(99);

        Collections.sort(al);
        System.out.println(al);
        //Arrays.sort(Arr);


        //System.out.println(Arrays.toString(Arr));


    }


}
