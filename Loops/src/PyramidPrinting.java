public interface PyramidPrinting {
    public static String firstMethod(int rows) {
        String answer = "";

        for (int i = 1; i <= rows; i++) {
            answer += "# ";
            System.out.println(answer);
        }
        return answer = "";
    }

    public static void main(String[] args) {
        System.out.println(firstMethod(5));

        int rows = 7;
        for (int i = 1; i <= rows; ++i) {
            for (int j = 1; j <= i; ++j) {
                System.out.print("# ");
            }
            System.out.println();
        }

    }
}
