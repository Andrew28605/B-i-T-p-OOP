package B11_giangvien;
import java.util.Scanner;

public abstract class GiangVien {
	  protected String hoTen;
	    protected String diaChi;
	    protected String loaiGV;

	    public GiangVien() {
	    }

	    public GiangVien(String hoTen, String diaChi, String loaiGV) {
	        this.hoTen = hoTen;
	        this.diaChi = diaChi;
	        this.loaiGV = loaiGV;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        System.out.printf("nhap ho ten: "); hoTen = sc.nextLine();
	        System.out.printf("nhap dia chi: "); diaChi = sc.nextLine();
	        System.out.printf("nhap loai GV: "); loaiGV = sc.nextLine();
	    }
	    public abstract double tinhLuong();
	    public String inThongTin(){
	        return "ho ten=" + hoTen + " ,dia chi=" 
	                + diaChi + " ,loai giang vien="+loaiGV + " ,luong=" + tinhLuong();
	    }
	}
