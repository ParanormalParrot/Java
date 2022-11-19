public class Student {

    private String name;
    private boolean isPresent;
    private int grade;
    public Student(String name){
        this.name = name;
    }

    public void setIsPresent(boolean present){
        isPresent = present;
    }

    public boolean isPresent(){
        return isPresent;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public String getName(){
        return name;
    }

    public String toString(){
        return name + "\t" + grade + "\n";
    }
}
