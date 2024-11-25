package B5_SinhVien;
import java.util.Scanner;

public class Truong {
	private String ten;
    private String diaChi;
    private String hieuTruong;

    public Truong() {
    }

    public Truong(String ten, String diaChi, String hieuTruong) {
        this.ten = ten;
        this.diaChi = diaChi;
        this.hieuTruong = hieuTruong;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public String getHieuTruong() {
        return hieuTruong;
    }

    public void setHieuTruong(String hieuTruong) {
        this.hieuTruong = hieuTruong;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten truong: "); ten = sc.nextLine();
        System.out.printf("nhap dia chi: "); diaChi = sc.nextLine();
        System.out.printf("nhap ten hieu truong: "); hieuTruong = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Truong{" + "ten=" + ten + ", diaChi=" + diaChi + ", hieuTruong=" + hieuTruong + '}';
    }
    
}
