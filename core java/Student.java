import java.util.ArrayList;
public class Student {
    private int stdId;
    private String stdName;
    private int age;

    public Student(int stdId, String stdName, int age) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.age = age;
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "stdId=" + stdId +
                ", stdName='" + stdName + '\'' +
                ", age=" + age +
                '}';
    }
}
class MainFunction3 {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        // Adding students to the list
        students.add(new Student(1, "Student1", 20));
        students.add(new Student(2, "Student2", 21));
        students.add(new Student(3, "Student3", 22));
        students.add(new Student(4, "Student4", 23));
        students.add(new Student(5, "Student5", 24));

        // Displaying all student details
        for (Student student : students) {
            System.out.println(student);
        }
    }
}