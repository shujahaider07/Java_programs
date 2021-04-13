import java.util.*;

public class shuja {


    public static void arraylst(ArrayList al) {

        long time = System.currentTimeMillis();

        for(int i = 0; i < 200000; i++) {

            al.add(0,i);

        }

        long endTym = System.currentTimeMillis();
        System.out.println("Arraylists time taken"+al.getClass().getName()+"-->"+(endTym-time));
    }



    public static void linklst(LinkedList list) {

        long time = System.currentTimeMillis();

        for(int i = 0; i < 200000; i++) {

            list.add(0+i);

        }

        long endTym = System.currentTimeMillis();
        System.out.println("Linklist time taken "+list.getClass().getName()+"-->"+(endTym-time));

    }





    public static void main(String[] args) {

        ArrayList al = new ArrayList();

        LinkedList ls = new LinkedList();

        arraylst(al);
        linklst(ls);

    }


}


