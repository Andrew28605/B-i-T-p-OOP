package B4_benhnhan;
import java.util.Scanner;

public class BenhNhan extends Nguoi {
	   private String tienSu;
	    private String chuanDoan;
	    private BenhVien benhvien;

	    public BenhNhan() {
	    }

	    public BenhNhan(String tienSu, String chuanDoan, BenhVien benhvien) {
	        this.tienSu = tienSu;
	        this.chuanDoan = chuanDoan;
	        this.benhvien = benhvien;
	    }

	    public BenhNhan(String tienSu, String chuanDoan, BenhVien benhvien, String ten, int tuoi, char gioiTinh) {
	        super(ten, tuoi, gioiTinh);
	        this.tienSu = tienSu;
	        this.chuanDoan = chuanDoan;
	        this.benhvien = benhvien;
	    }

	    public String getTienSu() {
	        return tienSu;
	    }

	    public void setTienSu(String tienSu) {
	        this.tienSu = tienSu;
	    }

	    public String getChuanDoan() {
	        return chuanDoan;
	    }

	    public void setChuanDoan(String chuanDoan) {
	        this.chuanDoan = chuanDoan;
	    }

	    public BenhVien getBenhvien() {
	        return benhvien;
	    }

	    public void setBenhvien(BenhVien benhvien) {
	        this.benhvien = benhvien;
	    }
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        super.nhap();
	        System.out.printf("nhap tien su: "); tienSu = sc.nextLine();
	        System.out.printf("nhap chuan doan: "); chuanDoan = sc.nextLine();
	        System.out.printf("nhap benh vien\n");
	        BenhVien benhvien = new BenhVien();
	        benhvien.nhap();
	        this.benhvien = benhvien;
	    }

	    @Override
	    public String toString() {
	        return "BenhNhan{" + super.toString()+ "tienSu=" + tienSu + ", chuanDoan=" + chuanDoan + ", benhvien=" + benhvien.toString() + '}';
	    }
	    
	}
