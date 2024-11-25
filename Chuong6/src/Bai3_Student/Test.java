package Bai3_Student;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
        // Tạo danh sách các sinh viên
        List<Student> students = new ArrayList<>();
        students.add(new Student("SV001", "Nguyen Van A", "01/01/2000", "Nam"));
        students.add(new Student("SV002", "Tran Thi B", "15/05/1999", "Nu"));
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream("student.dat"))) {
            for (Student student : students) {
                student.writeToFile(out);
            }
            System.out.println("Du lieu sinh vien da duoc ghi vao file student.dat.");
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
        try (DataInputStream in = new DataInputStream(new FileInputStream("student.dat"))) {
            System.out.println("\nThông tin sinh viên trong file:");
            while (true) {
                try {
                    Student student = Student.readFromFile(in);
                    System.out.println(student);
                } catch (EOFException e) {
                    break; 
                }
            }
        } 
        catch (IOException e) {
            e.printStackTrace();
        }
	}
}

