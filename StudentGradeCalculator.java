import java.util.Scanner;
public class StudentGradeCalculator {



//public class StudentGradeCalculator {
    public static void main(String[]args){
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter the number ofthe subject :");

        int numSubjects = scanner.nextInt();
        int totalMarks = 0;
        for (int i = 1; i<= numSubjects; i++){
            System.out.println("ENTER MARKS OBTAIN IN SUBJECT"+ i + ":");
            int marks = scanner.nextInt();
            totalMarks+=marks;
        }
        double averagePercentage =(double) totalMarks/numSubjects;
        String grade;
        if (averagePercentage>=90){
            grade ="o";
        } else if (averagePercentage>=80) {
            grade="a";
        } else if (averagePercentage>=70) {
            grade="b";
        } else if (averagePercentage>=60) {
            grade="c";
        } else if (averagePercentage>=50) {
            grade="d";
        }
        else {
            grade ="f";
        }
        System.out.println("total marks:"+totalMarks);
        System.out.println("average percentage:"+averagePercentage);
        System.out.println("grage:"+grade);

        scanner.close();
    }
}