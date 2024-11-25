package B13_laodong;
import java.util.Scanner;

public abstract class NguoiLaoDong {
	 protected String hoTen;
	    protected String diaChi;
	    protected String loaiLD;

	    public NguoiLaoDong() {
	    }

	    public NguoiLaoDong(String hoTen, String diaChi, String loaiLD) {
	        this.hoTen = hoTen;
	        this.diaChi = diaChi;
	        this.loaiLD = loaiLD;
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

	    public String getLoaiLD() {
	        return loaiLD;
	    }

	    public void setLoaiLD(String loaiLD) {
	        this.loaiLD = loaiLD;
	    }
	    
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap ho ten: "); hoTen = sc.nextLine();
	        System.out.printf("nhap dia chi: "); diaChi = sc.nextLine();
	        System.out.println("nhap loai lao dong: "); loaiLD = sc.nextLine();
	    }
	    public abstract double tinhLuong();
	    public String inThongTin(){
	        return "ho ten=" + hoTen + " ,dia chi=" + diaChi + " ,loai lao dong=" 
	                + loaiLD + " ,luong=" + tinhLuong();
	    }
	}
