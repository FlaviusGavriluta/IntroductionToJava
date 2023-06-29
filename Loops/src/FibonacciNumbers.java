public class FibonacciNumbers {
    public static StringBuilder firstMethod(int n) {
        int i = 2;
        int[] fibs = new int[n];
        fibs[0] = 0;
        fibs[1] = 1;

        System.out.println("Fibonacci Series upto " + n + " Terms:");

        while (i < n) {
            fibs[i] = fibs[i - 2] + fibs[i - 1];
            i++;
        }
        StringBuilder fib = new StringBuilder();
        for (int j = 0; j < n; j++) {
            fib.append(fibs[j]);
            fib.append(", ");
        }
// Remove the last ", " from the string
        fib.deleteCharAt(fib.length() - 2);
        return fib;
    }

    public static String anotherMethod(int n) {
        String fibs = "";
        int first = 0;
        int second = 1;
        int fibonacci = 0;
        int k = 0;

        System.out.println("Fibonacci Series upto " + n + " Terms:");

        while (k < n) {
            if (k <= 1) {
                fibonacci = k;
                fibs += String.valueOf(fibonacci) + " ";
            } else {
                fibonacci = first + second;
                first = second;
                second = fibonacci;
                fibs += String.valueOf(fibonacci) + " ";
            }
            k++;
        }
        return fibs;
    }

    public static void main(String[] args) {
        System.out.println(firstMethod(13));
        System.out.println(anotherMethod(8));
    }
}
