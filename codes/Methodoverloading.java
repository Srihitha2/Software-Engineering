public class MathUtils {
    public int sum(int a, int b) {
        return a + b;
    }
 
    public double sum(double a, double b) {
        return a + b;
    }
 
    public int sum(int a, int b, int c) {
        return a + b + c;
    }
 
    public static void main(String[] args) {
        MathUtils math = new MathUtils();
        int result1 = math.sum(2, 3);
        double result2 = math.sum(2.5, 3.5);
        int result3 = math.sum(2, 3, 4);
 
        System.out.println("result1: " + result1);
        System.out.println("result2: " + result2);
        System.out.println("result3: " + result3);
    }
}
