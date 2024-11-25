package b10_hinh_chu_nhat;
import java.util.Scanner;

public class HinhChuNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao chieu dai hinh chu nhat : ");
        int cd = sc.nextInt();
        System.out.println("nhap vao chieu rong hinh chu nhat : ");
        int cr = sc.nextInt();
        int chuvi=(cd+cr)*2;
        int dientich=cd*cr;
        System.out.println("dien tich hinh chu nhat la : "+dientich);
        System.out.println("chu vi hinh chu nhat la : "+chuvi);
    }
}
