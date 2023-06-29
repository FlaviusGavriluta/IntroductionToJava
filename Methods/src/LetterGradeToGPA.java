public class LetterGradeToGPA {
    public static void main(String[] args) {
        System.out.println("Grade A-: " + letterToGPA("A-"));
        System.out.println("Grade B: " + letterToGPA("B"));
        System.out.println("Grade C+: " + letterToGPA("C+"));
        System.out.println("Grade F: " + letterToGPA("F"));
    }

    public static double letterToGPA(String grade) {
        double answer;
        switch (grade) {
            case "A+":
            case "A":
                answer = 4;
                break;
            case "A-":
                answer = 3.7;
                break;
            case "B+":
                answer = 3.3;
                break;
            case "B":
                answer = 3;
                break;
            case "B-":
                answer = 2.8;
                break;
            case "C+":
                answer = 2.5;
                break;
            case "C":
                answer = 2;
                break;
            case "C-":
                answer = 1.8;
                break;
            case "D":
                answer = 1.5;
                break;
            case "F":
                answer = 0;
                break;
            default:
                answer = -1;
                break;
        }
        return answer;
    }
}
