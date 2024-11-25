package b17_tim_3_so;
import java.util.Scanner;

public class Tim3So {
	   public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("nhap vao so trong khoang tu 100 den 999 :");
	        int n = sc.nextInt();
	        if(n>=100 && n<=999){
	            int sohangtram=(int) (n/100);
	            int sohangchuc=(int) (n-sohangtram*100)/10;
	            int sohangdonvi=(int) (n-sohangtram*100-sohangchuc*10);
	            if(Math.pow(sohangtram,3)+Math.pow(sohangchuc,3)+Math.pow(sohangdonvi,3)==n){
	                System.out.println("so nay thoa man dieu kien a^3 + b^3 + c^3 = n");
	            }
	            else
	                System.out.println("so nay khong thoa man dieu kien a^3 + b^3 + c^3 = n");
	        }
	        else
	            System.out.println("so ban nhap khong nam trong khoang tu 100 den 999");
	    }
	}
