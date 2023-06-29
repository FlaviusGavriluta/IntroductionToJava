public class WhatDayIsIt {
    public static void main(String[] args) {
        int x = 7;
        String answer;
        switch (x) {
            case 1:
                answer = "Sunday";
                break;
            case 2:
                answer = "Monday";
                break;
            case 3:
                answer = "Tuesday";
                break;
            case 4:
                answer = "Wednesday";
                break;
            case 5:
                answer = "Thursday";
                break;
            case 6:
                answer = "Friday";
                break;
            case 7:
                answer = "Saturday";
                break;
            default:
                answer = "invalid input";
        }
        System.out.println(answer);
    }
}
