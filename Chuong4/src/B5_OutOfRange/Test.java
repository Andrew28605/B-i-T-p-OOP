package B5_OutOfRange;
import java.util.Scanner;

public class Test {
	  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("nhap so trong phap vi tu 5.000.000 den 20.000.000: ");
	        int so=sc.nextInt();
	        try{
	        Nhap N1= new Nhap(so);
	        } catch (Exception e) {
	            System.out.println("loi "+e.getMessage());
	        }
	        do{
	            System.out.println("hay nhap lai so trong pham vi 5.000.000 den 20.000.000: ");
	            so=sc.nextInt();
	        }while (so<5000000 || so>20000000);
	        System.out.println("ban da nhap so dung pham vi");
	    }
	}
