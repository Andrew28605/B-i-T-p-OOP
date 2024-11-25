package B9_array_shape;
import java.util.Scanner;

public class Test {
	  public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.println("nhap so phan tu cua hinh chu nhat");
	        int n = sc.nextInt();
	        Rectangle[] rectangle = new Rectangle[n];
	        System.out.println("nhap hinh chu nhat");
	        for(int i=0 ; i<n ; i++){
	            System.out.println("nhap thong tin cua hinh thu " + (i+1));
	            rectangle[i] = new Rectangle();
	            rectangle[i].nhap();
	        }
	        System.out.println("nhap so phan tu hinh tam giac");
	        int m = sc.nextInt();
	        Triangle[] triangle = new Triangle[m];
	        System.out.println("nhap hinh tam giac");
	        for(int i=0 ; i<m ; i++){
	            System.out.println("nhap thong tin cua hinh thu " + (i+1));
	            triangle[i] = new Triangle();
	            triangle[i].nhap();
	        }
	        for(int i=0 ; i<n ; i++){
	            System.out.println(rectangle[i].toString());
	        }
	        System.out.println("kiem tra doi tuong co thuoc lop khong");
	        System.out.println(rectangle[0] instanceof Shape);
	    }
	}