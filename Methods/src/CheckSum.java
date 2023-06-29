public class CheckSum {
    public static void main(String[] args) {
        int answer = checkSum(20, 80);
        System.out.println("The value of check is: " + answer);

        answer = checkSum(21, 80);
        System.out.println("The value of check is: " + answer);

        answer = checkSum(10, 80);
        System.out.println("The value of check is: " + answer);
    }

    public static int checkSum(int one, int two) {
        int check;
        int sum = one + two;
        if (sum < 100) check = 0;
        else if (sum == 100) check = 2;
        else check = 1;
        return check;
    }
}