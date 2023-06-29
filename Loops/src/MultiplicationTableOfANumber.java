public class MultiplicationTableOfANumber {
    public static String test(int num) {
        int i = 1;
        String answer = "";
        while (i <= 10) {
            answer += String.valueOf(num * i) + " ";
            i++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(test(5));
    }
}
