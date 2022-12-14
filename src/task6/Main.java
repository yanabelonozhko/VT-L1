package task6;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; ++i) {
            System.out.print("Enter number: ");
            array[i] = scanner.nextInt();
        }
        Transformation transformation = new Transformation();
        int[][] matrix = transformation.TransformMatrix(array);
        System.out.println(Arrays.deepToString(matrix));
    }
}
