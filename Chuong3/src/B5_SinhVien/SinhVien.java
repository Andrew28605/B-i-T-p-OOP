package B5_SinhVien;
import java.util.Scanner;

public class SinhVien extends Nguoi{
	 private String lop;
	    private String nganh;
	    private Truong truong;

	    public SinhVien() {
	    }

	    public SinhVien(String lop, String nganh, Truong truong) {
	        this.lop = lop;
	        this.nganh = nganh;
	        this.truong = truong;
	    }

	    public SinhVien(String lop, String nganh, Truong truong, String ten, int tuoi, char gioiTinh) {
	        super(ten, tuoi, gioiTinh);
	        this.lop = lop;
	        this.nganh = nganh;
	        this.truong = truong;
	    }

	    public String getLop() {
	        return lop;
	    }

	    public void setLop(String lop) {
	        this.lop = lop;
	    }

	    public String getNganh() {
	        return nganh;
	    }

	    public void setNganh(String nganh) {
	        this.nganh = nganh;
	    }

	    public Truong getTruong() {
	        return truong;
	    }

	    public void setTruong(Truong truong) {
	        this.truong = truong;
	    }
	    public void nhap(){
	        Scanner sc = new Scanner(System.in);
	        super.nhap();
	        System.out.printf("nhap lop: "); lop = sc.nextLine();
	        System.out.printf("nhap nganh: "); nganh = sc.nextLine();
	        System.out.printf("nhap truong\n");
	        Truong truong = new Truong(); truong.nhap();
	        this.truong = truong;    
	    }

	    @Override
	    public String toString() {
	        return "SinhVien{"+ super.toString() + "lop=" + lop + ", nganh=" + nganh + ", truong=" + truong.toString() + '}';
	    }
	    
	}
