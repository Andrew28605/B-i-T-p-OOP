package B13_laodong;
import java.util.Scanner;

public class LaoDongPhoThong  extends NguoiLaoDong {
	 protected int soNgayCong;
	    protected double donGiaNgayCong;

	    public LaoDongPhoThong() {
	        super();
	    }

	    public LaoDongPhoThong(int soNgayCong, double donGiaNgayCong) {
	        this.soNgayCong = soNgayCong;
	        this.donGiaNgayCong = donGiaNgayCong;
	    }

	    public LaoDongPhoThong(int soNgayCong, double donGiaNgayCong, String hoTen, String diaChi, String loaiLD) {
	        super(hoTen, diaChi, loaiLD);
	        this.soNgayCong = soNgayCong;
	        this.donGiaNgayCong = donGiaNgayCong;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("nhap so ngay cong: "); soNgayCong = sc.nextInt();
	        System.out.printf("nhap don gia ngay cong: "); donGiaNgayCong = sc.nextDouble();
	    }
	    @Override
	    public double tinhLuong() {
	        double thuong;
	        if(soNgayCong <= 15) thuong = 0;
	        else if(soNgayCong > 15 && soNgayCong < 25) thuong = 700000;
	        else thuong = 1000000;
	        return soNgayCong * donGiaNgayCong + thuong;
	    }
	     public String inThongTin(){
	         return super.inThongTin() + " so ngay cong=" + soNgayCong + " ,don gia ngay cong=" + donGiaNgayCong;
	     }
	}
