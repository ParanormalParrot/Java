import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Group group = new Group();
        group.addStudent(new Student("Andrew Anderson"));
        group.addStudent(new Student("Boris Barnes"));
        group.addStudent(new Student("Camila Campbell"));
        group.addStudent(new Student("Dennis Dean"));
        group.addStudent(new Student("Ethan Evans"));
        group.addStudent(new Student("Frank Freeman"));
        group.startSeminar();
    }
}
