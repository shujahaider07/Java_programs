package linklist;

import java.util.Scanner;

public class data {

   private String name ;
    private int rollNo;


    data(String name ,int rollNo){
        this.name=name;
        this.rollNo=rollNo;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setRollNo(int rollNo) {
        this.rollNo = rollNo;
    }

    public int getRollNo() {
        return rollNo;

    }

    @Override
    public String toString() {
        return "data{" +
                "name='" + name + '\'' +
                ", rollNo=" + rollNo +
                '}';
    }
}
