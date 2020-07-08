package lowlevel.forJava;

public class GrassHopper {

    public static char getGrade(int s1, int s2, int s3) {
        char grade = ' ';

        int mean = (s1 + s2 + s3) / 3;


        if (mean >= 90) {
            System.out.println("A Mean: " + mean);
            grade = 'A';
        } else if (mean >= 80) {
            System.out.println("B Mean: " + mean);
            grade = 'B';
        } else if (mean >= 70) {
            System.out.println("C Mean: " + mean);
            grade = 'C';
        } else if (mean >= 60) {
            System.out.println("D Mean: " + mean);
            grade = 'D';
        } else if (mean >= 0) {
            System.out.println("F Mean: " + mean);
            grade = 'F';
        }


        return grade;
    }
}
