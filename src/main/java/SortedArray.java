import java.util.Arrays;
import java.util.Scanner;

public class SortedArray {

    public static int[] getIntegers(int arraySize) {
        int[] array = new int[arraySize];
        Scanner scanner = new Scanner(System.in);
        int entryCount = 0;
        while (entryCount < arraySize) {
            System.out.println("Type an integer: ");
            array[entryCount++] = scanner.nextInt();
        }
        System.out.println("Generated array: " +  Arrays.toString(array));
        return array;
    }

    public static void printArray(int[] array) {
        for (int i = 0 ; i < array.length ; i++) {
            System.out.printf("Element %d contents %d%n", i, array[i]);
        }
    }
}
