class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }
}

public class Main {
    public static void main(String[] args) {
        MathOperations math = new MathOperations();

        int sum1 = math.add(3, 4);
        System.out.println("Sum of integers: " + sum1);

        double sum2 = math.add(3.5, 4.2);
        System.out.println("Sum of doubles: " + sum2);
    }
}
