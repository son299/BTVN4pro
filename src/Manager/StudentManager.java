    package Manager;
    import models.Student;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class StudentManager {

        ArrayList<Student> listStudent = new ArrayList<>();

        public  void addStudent(Student student){
            listStudent.add(student);
        }

        public void printMenu(){
            System.out.println("Chọn một trong các tùy chọn sau:");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Hiển thị danh sách sinh viên");
            System.out.println("3. Chỉnh sửa thông tin sinh viên");
            System.out.println("4. Xóa sinh viên");
            System.out.println("5. Tìm kiếm sinh viên");
            System.out.println("6. Sắp xếp danh sách sinh viên");
            System.out.println("7. Thoát");
        }




        public static void main (String[]args) {
            StudentManager stdMn = new StudentManager();
            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                stdMn.printMenu();
                 choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("Nhập tên sinh viên:");
                        String name = scanner.nextLine();
                        System.out.println("Nhập tuổi sinh viên:");
                        int tuoi = Integer.parseInt(scanner.nextLine());
                        System.out.println("Nhập điểm trung bình:");
                        double gpa = Double.parseDouble(scanner.nextLine());
                        Student student = new Student(gpa, tuoi, name);
                        stdMn.addStudent(student);
                        System.out.println("Thêm sinh viên thành công.");
                        break;

                    case 2:

                        break;

                    case 7:
                        System.out.println("Thoát chương trình.");
                        break;
                }

            } while (choice !=  7);
        }
    }
