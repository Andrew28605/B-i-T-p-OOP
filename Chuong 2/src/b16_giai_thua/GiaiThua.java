package b16_giai_thua;
import java.util.Scanner;

public class GiaiThua {
	   public int giaithua(int n){
	        if(n==1 || n==0)
	            return 1;
	        else return n*giaithua(n-1);
	    }

	    public static void main(String[] args) {
	        Scanner sc=new Scanner(System.in);
	        System.out.println("nhap vao so n : ");
	        int n=sc.nextInt();
	        GiaiThua giaithua=new GiaiThua();
	        int giaithuatren=giaithua.giaithua(n);
	        System.out.println("giai thua tren "+n+" la : "+giaithuatren);
	    }
	}
