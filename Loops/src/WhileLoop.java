public class WhileLoop {
    public static void main(String[] args) {
        int x = 0;
        int y = 0;
        while (x != 4) {
            y += x;
            x += 1;
        }
        System.out.println("x: " + x);
        System.out.println("y: " + y);
    }
}