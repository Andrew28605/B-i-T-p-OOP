package Bai2_doi_tien;
import java.util.Scanner;

public class Test {
	 public static void main(String[] args) {
	        // Khởi tạo đối tượng Exchange để sử dụng phương thức convert
	        Exchange exchange = new Exchange();

	        // Khởi tạo Scanner để đọc dữ liệu từ người dùng
	        Scanner scanner = new Scanner(System.in);

	        // Nhập mã tiền tệ đầu vào và đầu ra
	        System.out.print("Mời nhập vào mã tiền tệ thứ nhất: ");
	        String code1 = scanner.nextLine().toUpperCase();

	        System.out.print("Mời nhập mã tiền tệ thứ hai: ");
	        String code2 = scanner.nextLine().toUpperCase();

	        // Nhập số tiền cần chuyển
	        System.out.print("Mời nhập lượng tiền cần chuyền đổi: ");
	        double amount = scanner.nextDouble();

	        // Chuyển đổi tiền tệ
	        double result = exchange.convert(code1, code2, amount);

	        // Kiểm tra và hiển thị kết quả
	        if (result != -1) {
	            System.out.println("Lượng tiền sau khi đổi: " + result);
	        } else {
	            System.out.println("Không tìm thấy tỷ giá chuyển đổi cho " + code1 + " -> " + code2);
	        }

	        scanner.close();
	    }
	}
