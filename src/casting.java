import java.util.Arrays;

public class casting {


    public static void main(String[] args) {


        byte b = 20;
        short a = b; // Automatic


        double d = 50;
        int n = (int) d;


        float arr[][] = {{12, 54, 89}, {12, 45, 67, 68}};
        System.out.println(Arrays.deepToString(arr));

        //System.out.println(arr[0][2]);


        for (float f = 1; f < 0; f++) {
            System.out.println(Arrays.deepToString(arr));
        }


    }


}
