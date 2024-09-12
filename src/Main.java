import java.util.ArrayList;
import models.Student;
public class Main {

    public  static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<Student>();
        Student std1 = new Student("Duong Quang Son",19);
        Student std2 = new Student("Tong Thuy Ly",19);
        list.add(std1);
        list.add(std2);

    }

}