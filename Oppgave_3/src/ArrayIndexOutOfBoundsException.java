import java.util.*;

public class ArrayIndexOutOfBoundsException {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int[] array = new int[120];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 120);
        }

        System.out.print("Enter an index between 1 and 120: ");
        int guess = input.nextInt() - 1;

        try {
            System.out.println("The corresponding element of index " + (guess + 1) + " is " + array[guess]);
        }
        catch (java.lang.ArrayIndexOutOfBoundsException ex) {
            System.out.println("Index " + (guess + 1) +  " is out of bounds");

        }

    }
}
