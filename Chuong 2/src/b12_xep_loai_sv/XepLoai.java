package b12_xep_loai_sv;
import java.util.Scanner;

public class XepLoai {

	   public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("Nhap vao diem cua sinh vien(0-100) : ");
	        int diem=sc.nextInt();
	        if(diem>=90 && diem<=100)
	            System.out.println("xep loai A");
	        else if(diem>=80 && diem<90)
	            System.out.println("xep loai B");
	        else if(diem>=70 && diem<80)
	            System.out.println("xep loai C");
	        else if(diem>=50 && diem<70)
	            System.out.println("xep loai D");
	        else if(diem>=0 && diem <50)
	            System.out.println("xep loai F");
	        else
	            System.out.println("ban da nhap sai diem");
	    }
}

