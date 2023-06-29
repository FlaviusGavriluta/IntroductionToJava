import java.util.Scanner;

public class SumOfDigitisInAnInteger {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        String number = scanner.nextLine();
        int num = Integer.parseInt(number);
        System.out.println("Sum of digits in " + number + " is: " + sumOfDig(num));
    }

    public static int sumOfDig(int number) {
        int result = 0;
        int lastDigit = 0;
        while (number > 0) {
            lastDigit = number % 10;
            result += lastDigit;
            number /= 10;
        }
        return result;
    }
}
