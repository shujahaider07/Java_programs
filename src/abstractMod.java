import abstraction.rectangle;
import abstraction.shape;

public class abstractMod extends shape {


    @Override
    public void draw() {
        System.out.println("drawing circle");

    }

    public static void main(String[] args) {

        shape s1  = new rectangle();
         s1.draw();

         shape s2 = new abstractMod();
         s2.draw();


    }

}
