package b19_doi_gio;
import java.util.Scanner;

public class DoiGio {

	 public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("nhap vao so gio : ");
	        int gio=sc.nextInt();
	        System.out.println("nhap vao so phut : ");
	        int phut=sc.nextInt();
	        System.out.println("nhap vao so giay : ");
	        int giay=sc.nextInt();
	      int tongsogiay=gio*3600+phut*60+giay;
	        System.out.println("tong so giay la : "+tongsogiay+"s");
	    }
	}

