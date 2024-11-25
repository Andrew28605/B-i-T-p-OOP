package Bai4_tra_tu_dien;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        // Tạo đối tượng Dictionary
        Dictionary dict = new Dictionary();

        // Tạo Scanner để nhận đầu vào từ người dùng
        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Nhập từ cần tra
            System.out.print("Moi nhap tu can tra: ");
            String word = scanner.nextLine().trim();

            // Nếu từ nhập vào là chuỗi rỗng, kết thúc chương trình
            if (word.isEmpty()) {
                break;
            }

            // Tra cứu nghĩa của từ
            String meaning = dict.lookup(word);
            System.out.println("Nghia cua tu la: " + meaning);
        }

        // Đóng Scanner
        scanner.close();
    }
}
