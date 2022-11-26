package task2;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите x: ");
        double x = scanner.nextDouble();
        System.out.println("Введите y: ");
        double y = scanner.nextDouble();
        TopPart topPart = new TopPart();
        BottomPart botPart = new BottomPart();
        System.out.println("Result: " + (topPart.IsContained(x, y) || topPart.IsContained(x, y)));
    }
}

