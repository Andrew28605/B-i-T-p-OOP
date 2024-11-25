package b6_tong_hieu_tich_thuong;
import java.util.Scanner;

public class TongHieuTichThuong {
	public static void main(String[] Args) {
	  Scanner sc=new Scanner(System.in);
      System.out.println("nhap vao so nguyen a va b : ");
      int a= sc.nextInt();
      int b=sc.nextInt();
      int tong=a+b;
      int hieu=a-b;
      int tich=a*b;
      float thuong=(float)a/b;
      System.out.println("tong 2 so tren la : "+tong);
      System.out.println("hieu 2 so tren la : "+hieu);
      System.out.println("tich 2 so tren la : "+tich);
      System.out.println("thuong 2 so tren la : "+thuong);

  }
}
