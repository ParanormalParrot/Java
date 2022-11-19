import java.util.ArrayList;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

public class Group {
    private Scanner in;
    private ArrayList<Student> students;

    public Group() {
        in = new Scanner(System.in);
        students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public void getRandomStudent() {
        int index = (int) (Math.random() * students.size());
        if (students.get(index).isPresent()) {
            System.out.println(students.get(index).getName() + " has already answered.");
        } else {
            System.out.println("Is " + students.get(index).getName() + " present on the seminar?(y/n)");
            String input = "";
            while (!Objects.equals(input, "y") && !Objects.equals(input, "n")) {
                input = in.nextLine();
            }
            students.get(index).setIsPresent(input.equals("y"));
            if (students.get(index).isPresent()) {
                System.out.println("Student's mark:");
                int mark;
                mark = in.nextInt();
                students.get(index).setGrade(mark);
            }
            System.out.println("Ok");
        }
    }

    public void printStudents() {
        for (Student student : students) {
            if (student.isPresent()) {
                System.out.print(student);
            }
        }
    }

    public void printHelp() {
        System.out.println("/r - choose a random student");
        System.out.println("/l - print the list of students with grades");
        System.out.println("/h - print help");
        System.out.println("/e - end the seminar");
    }

    public void startSeminar() {
        printHelp();
        String input = "";
        while (!input.equals("/e")) {
            input = in.nextLine();
            if (input.equals("/r")) {
                getRandomStudent();
            } else if (input.equals("/l")) {
                printStudents();
            } else if (input.equals("/h")) {
                printHelp();
            }
        }
    }
}
