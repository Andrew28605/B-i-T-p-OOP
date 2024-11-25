package B11_giangvien;
import java.util.Scanner;

public class GVThinhGiang extends GiangVien {
	  protected int soTietDay;
	    protected double donGia;

	    public GVThinhGiang() { 
	        super();
	    }

	    public GVThinhGiang(int soTietDay, double donGia) {
	        this.soTietDay = soTietDay;
	        this.donGia = donGia;
	    }

	    public GVThinhGiang(int soTietDay, double donGia, String hoTen, String diaChi, String loaiGV) {
	        super(hoTen, diaChi, loaiGV);
	        this.soTietDay = soTietDay;
	        this.donGia = donGia;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("so tiet day: "); soTietDay  = sc.nextInt();
	        System.out.printf("don gia: "); donGia = sc.nextDouble();
	    }

	    @Override
	    public double tinhLuong() {
	        double thunhap = 0.15 * (soTietDay * donGia);
	        return soTietDay * donGia - thunhap;
	    }
	    
	}