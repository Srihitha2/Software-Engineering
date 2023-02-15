public class Example {
    public static void main(String[] args) {
        int i = 0;
        do {
            i++;
            if (i == 3 || i == 7) {
                continue;
            }
            System.out.println(i);
        } while (i < 10);
    }
}
