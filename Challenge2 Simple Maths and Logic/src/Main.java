public class Main {
    public static void main(String args[]) {
        boolean x = true;
        boolean y = true;
        boolean answer;

        boolean negation = !x;
        boolean whichOne = x ^ negation;
        boolean sum = whichOne && y;
        answer = !sum;
        System.out.println(answer);
    }
}