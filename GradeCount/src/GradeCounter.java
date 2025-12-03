import java.util.Scanner;
import java.util.Vector;

public class GradeCounter {
private Scanner scanner = new Scanner(System.in);

// create a vector for each grade category
    Vector<Integer> A = new Vector<>();
    Vector<Integer> B = new Vector<>();
    Vector<Integer> C = new Vector<>();
    Vector<Integer> D = new Vector<>();
    Vector<Integer> F = new Vector<>();

    public void whereTheMagicHappens() {
        while (true) {
            IO.println("Please enter a grade between 0 to 100 or -1 to quit: ");
            int grade = scanner.nextInt();

            if (grade == -1){
                break;
            } else {
                if (grade >= 90 && grade <= 100){
                    A.add(grade);
                }
                if (grade >= 80 && grade <= 89){
                    B.add(grade);
                }
                if (grade >= 70 && grade < 79 ){
                    C.add(grade);
                }
                if (grade >= 60 && grade <= 69){
                    D.add(grade);
                }
                if (grade < 59 ){
                    F.add(grade);
                } else {
                    IO.println("Invalid grade. Must be between 0 - 100");
                }
            }


        }
        int total = A.size() + B.size() + C.size() + D.size() + F.size();
        // output
        IO.println("\nTotal number of grades = " + total);
        IO.println("Number of A = " + A.size());
        IO.println("Number of B = " + B.size());
        IO.println("Number of C = " + C.size());
        IO.println("Number of D = " + D.size());
        IO.println("Number of F = " + F.size());

        IO.println("The A grade are: ");
        for (int grade : A) {
            IO.println(grade);
            if (grade < 1) {
                IO.println(", ");
            }
        }
        IO.println();
    }
}
