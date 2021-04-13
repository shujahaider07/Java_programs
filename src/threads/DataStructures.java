package threads;

import java.security.PublicKey;
import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Stack;

public class DataStructures {


    public static void stack(Stack stack) {
        Long startTime = System.currentTimeMillis();

        for (int i = 1; i < 200000; i++) {

            stack.add(0, i);
        }

        Long endTime = System.currentTimeMillis();

        System.out.println("the time of stack is " + stack.getClass().getName() + "--->" + (endTime - startTime));
    }


    public static void hashmap(HashMap hashMap) {

        Long startTime = System.currentTimeMillis();
        for (int i = 1; i < 200000; i++) {
            hashMap.put(0, i);
        }

        long endTime = System.currentTimeMillis();
        System.out.println("hashmap time is " + hashMap.getClass().getName() + "--->" + (endTime = startTime));
    }


    public static void arrList(ArrayList arrayList) {
        long Time = System.currentTimeMillis();
        for (int i = 1; i < 200000; i++) {
            arrayList.add(0, i);
        }
        long endtime = System.currentTimeMillis();
        System.out.println("The time of Arraylist is " + arrayList.getClass().getName() + "-->" + (Time - endtime));

    }


    public static void main(String[] args) throws InterruptedException {

        ArrayList al = new ArrayList();
        HashMap hs = new HashMap();
        Stack s1 = new Stack();
        //arrList(al);
        //hashmap(hs);
        //stack(s1);
    }


}





