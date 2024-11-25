package B5_SinhVien;

public class Test {
	public static void main(String[] args) {
        SinhVien sinhvien = new SinhVien();
        System.out.println("nhap thong tin sinh vien");
        sinhvien.nhap();
        System.out.println("thong tin sinh vien la: " + sinhvien.toString());
    }
}
