package b5_nhap_xuat;
import java.util.Scanner;

public class NhapXuat {
    public static void main(String[] Args) {

        Scanner sc = new Scanner(System.in);
        
        // Nhập số nguyên
        System.out.println("Nhập số nguyên: ");
        int n = sc.nextInt();
        
        // Nhập số thực
        System.out.println("Nhập số thực: ");
        double k = sc.nextDouble();
        
        // Xóa bộ đệm sau khi nhập số
        sc.nextLine(); 

        // Nhập ký tự
        System.out.println("Nhập một ký tự: ");
        char kitu = sc.next().charAt(0);
        
        // Xóa bộ đệm trước khi nhập chuỗi
        sc.nextLine();

        // Nhập chuỗi
        System.out.println("Nhập một chuỗi ký tự: ");
        String chuoi = sc.nextLine();

        // Xuất kết quả
        System.out.println("Số nguyên vừa nhập là: " + n);
        System.out.println("Số thực vừa nhập là: " + k);
        System.out.println("Ký tự vừa nhập là: " + kitu);
        System.out.println("Chuỗi vừa nhập là: " + chuoi);

    }
}