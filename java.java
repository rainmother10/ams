import java.util.Scanner;

public class java {
    static String[] studentInfo = new String[4];
    public static void main(String[] args) {
        load();
    }

    private static void load() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Student Management System");
        System.out.println("1 Enter Student list");
        System.out.println("2 Find student by last name");
        System.out.println("3 Find and edit students by full name");
        System.out.println("4 End ");
        int number = scanner.nextInt();
        switch (number) {
            case 1:
                Student_Management();
                
            case 2:
                Find_student();
                
            case 3:
                edit_students_by_full_name();
                
            case 4:
                System.out.println("Goodbye");
                break;
            default:
                System.out.println("Số bạn nhập không nằm trong phạm vi từ 1 đến 4");
        }
        scanner.close();
    }

    public static void Student_Management() {
        Scanner scanner = new Scanner(System.in);
        // Khởi tạo mảng để lưu thông tin
       
        // Nhập lựa chọn
        System.out.print("Enter your choice:");
        studentInfo[0] = scanner.nextLine();
        // Nhập số lượng sinh viên
        System.out.print("Enter the number of students:");
        studentInfo[1] = scanner.nextLine();
        // Nhập first name
        System.out.print("Enter first name:");
        studentInfo[2] = scanner.nextLine();
        // Nhập last name
        System.out.print("Enter last name:");
        studentInfo[3] = scanner.nextLine();

        load(); // Gọi lại phương thức load để hiển thị menu sau khi hoàn thành nhập thông tin sinh viên
    }

    public static void Find_student() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the last name of the student you want to find:");
        String lastNameToFind = scanner.nextLine();     
        boolean found = false;       
        for (int i = 0; i < studentInfo.length; i += 4) {
          
            if (studentInfo[i + 3].equalsIgnoreCase(lastNameToFind)) {           
                found = true;             
                System.out.println("Choice: " + studentInfo[i]);
                System.out.println("Number of students: " + studentInfo[i + 1]);
                System.out.println("First name: " + studentInfo[i + 2]);
                System.out.println("Last name: " + studentInfo[i + 3]);
                
            }
            
            }
            if (!found){
                System.out.println("errror");
                
            }
            load();
        }
        


    public static void edit_students_by_full_name() {
       
    }
}
