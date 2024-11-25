package B10_hocvien;
import java.util.Scanner;

public class HocVienLT  extends HocVien {
	protected int soBuoi;
    protected double donGiaLT;
    protected int loaiUuTien;

    public HocVienLT() {
        super();
    }

    public HocVienLT(int soBuoi, double donGiaLT, int loaiUuTien) {
        this.soBuoi = soBuoi;
        this.donGiaLT = donGiaLT;
        this.loaiUuTien = loaiUuTien;
    }

    public HocVienLT(int soBuoi, double donGiaLT, int loaiUuTien, String hoTen, String diaChi, String loaiCT) {
        super(hoTen, diaChi, loaiCT);
        this.soBuoi = soBuoi;
        this.donGiaLT = donGiaLT;
        this.loaiUuTien = loaiUuTien;
    }
    public void nhapThongTin(){
        Scanner sc = new Scanner(System.in);
        super.nhapThongTin();
        System.out.printf("nhap so buoi: "); soBuoi = sc.nextInt();
        System.out.printf("nhap don gia LT: "); donGiaLT = sc.nextDouble();
        System.out.printf("nhap loai uu tien: "); loaiUuTien = sc.nextInt();
    }

    @Override
    public double hocPhi() {
        double UuTien;
        if(loaiUuTien == 1) UuTien = 1000000;
        else UuTien = 800000;
        return soBuoi * donGiaLT - UuTien;
    }
}
