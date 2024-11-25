package B14_congnhan;
import java.util.Scanner;

public class CNTCN extends CongNhan{
	 protected double luongCoBan;
	    protected double heSoLuong;
	    protected int soNgayCong;

	    public CNTCN() { super();
	    }

	    public CNTCN(double luongCoBan, double heSoLuong, int soNgayCong, String hoTen, String diaChi, String loaiCN) {
	        super(hoTen, diaChi, loaiCN);
	        this.luongCoBan = luongCoBan;
	        this.heSoLuong = heSoLuong;
	        this.soNgayCong = soNgayCong;
	    }

	    public CNTCN(double luongCoBan, double heSoLuong, int soNgayCong) {
	        this.luongCoBan = luongCoBan;
	        this.heSoLuong = heSoLuong;
	        this.soNgayCong = soNgayCong;
	    }

	    public double getLuongCoBan() {
	        return luongCoBan;
	    }

	    public void setLuongCoBan(double luongCoBan) {
	        this.luongCoBan = luongCoBan;
	    }

	    public double getHeSoLuong() {
	        return heSoLuong;
	    }

	    public void setHeSoLuong(double heSoLuong) {
	        this.heSoLuong = heSoLuong;
	    }

	    public int getSoNgayCong() {
	        return soNgayCong;
	    }

	    public void setSoNgayCong(int soNgayCong) {
	        this.soNgayCong = soNgayCong;
	    }

	    public String getHoTen() {
	        return hoTen;
	    }

	    public void setHoTen(String hoTen) {
	        this.hoTen = hoTen;
	    }

	    public String getDiaChi() {
	        return diaChi;
	    }

	    public void setDiaChi(String diaChi) {
	        this.diaChi = diaChi;
	    }

	    public String getLoaiCN() {
	        return loaiCN;
	    }

	    public void setLoaiCN(String loaiCN) {
	        this.loaiCN = loaiCN;
	    }

	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("nhap luong co ban: "); luongCoBan = sc.nextDouble();
	        System.out.printf("nhap he so luong: "); heSoLuong = sc.nextDouble();
	        System.out.printf("nhap so ngay cong: "); soNgayCong = sc.nextInt();
	    }
	    
	    @Override
	    public double tinhLuong() {
	        double thuong ;
	        if(soNgayCong < 20) thuong = 0;
	        else thuong = (float) (1.2 * luongCoBan);
	        return luongCoBan * heSoLuong + thuong;
	    }

	    @Override
	    public String toString() {
	        return super.toString() + "CNTCN{" + "luongCoBan=" + luongCoBan + 
	                ", heSoLuong=" + heSoLuong + ", soNgayCong=" + soNgayCong + '}';
	    }
	}
