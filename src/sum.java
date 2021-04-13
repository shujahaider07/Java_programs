import java.util.Scanner;

public class sum {


    public static void main(String[] args) {


        Scanner reader = new Scanner(System.in);

        System.out.println("First:");
        int n = Integer.parseInt(reader.nextLine());

        System.out.println("Second:");
        int max = Integer.parseInt(reader.nextLine());

        int sum = 0;
        int i = 0;
        int difference = max - n;

        while (i < difference) {
            sum = n + (n + 1);
            n++;
            i++;

        }

        System.out.println("Sum is " + sum);
    }


}


