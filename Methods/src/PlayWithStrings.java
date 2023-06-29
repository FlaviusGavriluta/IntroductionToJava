public class PlayWithStrings {
    public static void main(String[] args) {
        System.out.println(test("HellO"));
        System.out.println(test("john"));
    }

    public static String test(String x) {
        if (x.length() % 2 == 0) {
            return x.toUpperCase();
        }
        return x.toLowerCase();
    }
}
