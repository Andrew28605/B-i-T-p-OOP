package B4_StringTooLong20;
import java.util.Scanner;

public class Test {

	  public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Nhap vao chuoi nho hon 20 ki tu : ");
	        String nhap=sc.next();
	        try {
	            Nhap N1 = new Nhap(nhap);
	        } catch (Exception e) {
	            System.out.println("loi " + e.getMessage());
	        }
	        System.out.println("Nhap tu 'DONE' de thoat chuong trinh : ");
	        String done= sc.next();
	        do{
	            System.out.println("hay nhap lai : ");
	            done= sc.next();
	            if(done.equals("DONE")){
	                System.out.println("thoat chuong trinh !!");
	            }
	            break;
	        }while(!done.equals("DONE"));
	    }
	}
