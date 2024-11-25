package b18_so_nguyen_to;
import java.util.Scanner;

public class SoNguyenTo {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("Nhập vào một số nguyên: ");
	        int n = sc.nextInt();

	        // Kiểm tra số nguyên tố
	        if (n <= 1) {
	            System.out.println("Đây không phải là số nguyên tố.");
	        } else {
	            boolean laNguyenTo = true;
	            for (int i = 2; i <= Math.sqrt(n); i++) {
	                if (n % i == 0) {
	                    laNguyenTo = false;
	                    break;
	                }
	            }

	            if (laNguyenTo) {
	                System.out.println("Đây là số nguyên tố.");
	            } else {
	                System.out.println("Đây không phải là số nguyên tố.");
	            }
	        }
	       
	    }
	}


