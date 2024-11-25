package B10_hocvien;
import java.util.Scanner;

public class HocVienDH extends HocVien{
	 protected int soBuoi;
	    protected double donGiaDH;
	    protected int loaiUuTien;

	    public HocVienDH() {
	        super();
	    }

	    public HocVienDH(int soBuoi, double donGiaDH, int loaiUuTien) {
	        this.soBuoi = soBuoi;
	        this.donGiaDH = donGiaDH;
	        this.loaiUuTien = loaiUuTien;
	    }

	    public HocVienDH(int soBuoi, double donGiaDH, int loaiUuTien, String hoTen, String diaChi, String loaiCT) {
	        super(hoTen, diaChi, loaiCT);
	        this.soBuoi = soBuoi;
	        this.donGiaDH = donGiaDH;
	        this.loaiUuTien = loaiUuTien;
	    }
	    public void nhapThongTin(){
	        Scanner sc = new Scanner(System.in);
	        super.nhapThongTin();
	        System.out.printf("nhap so buoi: "); soBuoi = sc.nextInt();
	        System.out.printf("nhap don gia DH: "); donGiaDH = sc.nextDouble();
	        System.out.printf("nhap loai uu tien: "); loaiUuTien = sc.nextInt();
	    }

	    @Override
	    public double hocPhi() {
	        double UuTien;
	        if(loaiUuTien == 1) UuTien = 1000000;
	        else UuTien = 500000;
	        return soBuoi * donGiaDH - UuTien;
	    }
	    
	}
