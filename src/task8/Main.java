package task8;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] a = InputA.GetArray();
        int[] b = InputA.GetArray();
        System.out.println(Arrays.toString(Merger.GetIndex(a, b)));
    }
}
