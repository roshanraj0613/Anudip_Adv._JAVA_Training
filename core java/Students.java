import java.io.*;
import java.util.*;

public class Students implements Comparable<Students> {
    private String stdid, stdname;
    private int age;

    public String getStdid() {
        return stdid;
    }

    public void setStdid(String stdid) {
        this.stdid = stdid;
    }

    public String getStdname() {
        return stdname;
    }

    public void setStdname(String stdname) {
        this.stdname = stdname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Students std) {
        //comparison according to age
        return (this.age - std.age);
    }

    @Override
    public String toString() {
        return "Students [stdid=" + stdid + ", stdname=" + stdname + ", age=" + age + "]";
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Students> stdlist = new ArrayList<>();

        for (int i = 0; i < 5; i++) { // assuming we want to add 5 students
            System.out.print("Student id : ");
            String sid = br.readLine();
            System.out.print("Student name : ");
            String sname = br.readLine();
            System.out.print("Age(in year) : ");
            int stdage = Integer.parseInt(br.readLine());

            /*-----Student object-----*/
            Students std = new Students();
            /*--- setting data into student-----*/
            std.setStdid(sid);
            std.setStdname(sname);
            std.setAge(stdage);
            /*-----Insertion into arraylist--------------*/
            stdlist.add(std);
            System.out.println("-------------------------------------------------------");
        }

        System.out.println("Students are : \n");
        for (Students s : stdlist) {
            System.out.println(s);
        }

        /*---- To sort--- arraylist----*/
        Collections.sort(stdlist);
        System.out.println("Students are (sorted by age): \n");
        for (Students s : stdlist) {
            System.out.println(s);
        }
    }
}