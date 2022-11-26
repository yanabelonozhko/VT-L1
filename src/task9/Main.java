package task9;

public class Main {
    public static void main(String[] args) {
        var basket = new Basket(new Ball[] {
                new Ball(1, "blue"),
                new Ball(2, "blue"),
                new Ball(3, "red")
        });
        System.out.println("Weight: " + basket.getWeight());
        System.out.println("Blue balls count: " + basket.getBallsCount("blue"));
    }
}
class Basket {
    private Ball[] balls;

    public Basket(Ball[] balls) {
        this.balls = balls;
    }

    public double getWeight() {
        double weight = 0;
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getBallsCount(String color) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor().equals(color)) {
                ++count;
            }
        }
        return count;
    }
}
class Ball {
    private double weight;
    private String color;

    public Ball(double weight, String color) {
        this.weight = weight;
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public String getColor() {
        return color;
    }
}
