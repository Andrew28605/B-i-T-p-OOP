package B3_NhanVien;
import java.util.Scanner;

public class NhanVien {
	private String name;
    private DiaChi address;
    private String dob;
    private char gender;

    public NhanVien() {
    }

    public NhanVien(String name, DiaChi address, String dob, char gender) {
        this.name = name;
        this.address = address;
        this.dob = dob;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DiaChi getAddress() {
        return address;
    }

    public void setAddress(DiaChi address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "NhanVien{" + "name=" + name + ", address=" + address.toString() 
                + ", dob=" + dob + ", gender=" + gender + '}';
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.printf("nhap ten: "); name = sc.nextLine();
        System.out.printf("nhap dia chi\n ");
        DiaChi diachi = new DiaChi(); diachi.nhap();
        this.address = diachi;
        System.out.printf("nhap ngay sinh: "); dob = sc.nextLine();
        System.out.printf("nhap gioi tinh: ");
        gender = sc.next().charAt(0);
    }
}
