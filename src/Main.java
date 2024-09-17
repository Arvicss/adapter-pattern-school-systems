import attendance.AttendanceAdapter;
import attendance.AttendanceSystem;
import grading.GradingAdapter;
import grading.GradingSystem;
import java.util.Scanner;
import library.LibrarySystem;
import library.LibrarySystemAdapter;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        AttendanceAdapter attendanceAdapter = new AttendanceAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        GradingAdapter gradingAdapter = new GradingAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        LibrarySystemAdapter librarySystemAdapter = new LibrarySystemAdapter(librarySystem);

        boolean stopper = false;

        do {
            System.out.println("\nSelect Document that you want to manage");
            System.out.println("[1] Attendance");
            System.out.println("[2] Grading");
            System.out.println("[3] Library");
            System.out.println("[4] Exit");
            System.out.print("Option: ");

            int selectedOption = scanner.nextInt();

            switch(selectedOption) {
                case 1:
                    attendanceAdapter.integrateSystem();
                    break;
                case 2:
                    gradingAdapter.integrateSystem();
                    break;
                case 3:
                    librarySystemAdapter.integrateSystem();
                    break;
                case 4:
                    stopper = true;
                    break;
            }
        } while(!stopper);

        scanner.close();
    }
}
