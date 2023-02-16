public class Main {
    public static void main(String[] args) {
        int x = 5;
        int y = 7;
        int sum = add(x, y);
        System.out.println("The sum of " + x + " and " + y + " is " + sum);
    }

    public static int add(int a, int b) {
        int result = a + b;
        return result;
    }
}
