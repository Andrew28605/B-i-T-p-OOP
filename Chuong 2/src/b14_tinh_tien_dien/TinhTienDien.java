package b14_tinh_tien_dien;
import java.util.Scanner;

public class TinhTienDien {
    public int tien(int n){
        if(n>=0 && n<=50)
            return n*1484;
        else if(n>50 && n<=100)
            return 50*1484+(n-50)*1535;
        else if(n>100 && n<200)
            return 50*1484+50*1535+(100-n)*1786;
        else
            return 50*1484+50*1535+100*1786+(n-200)*2242;

    }


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so dien tieu thu trong 1 thang : ");
        int k=sc.nextInt();
        TinhTienDien tinhtongtiendien = new TinhTienDien();
        int ketqua=tinhtongtiendien.tien(k);
        System.out.println("tong so tien phai tra la : "+ketqua+" VND");




    }
}
