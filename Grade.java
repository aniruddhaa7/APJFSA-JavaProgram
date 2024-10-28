public class Grade {
    public static void main(String[] args) {
        System.out.println("This is the Grading System of Anudip");
        int a = 54;
        if (a > 90) {
            System.out.println("The student has got A grade ");
        }
        else if (a > 80) {
            System.out.println("The student has got B grade ");
        }
        else if (a > 70) {
            System.out.println("The student has got C grade ");
        }
        else if (a >= 50) {
            System.out.println("The student has got D grade ");
        }
        else {
            System.out.println("The student has got F grade ");
        }
    }
}