package b21_nhapxuatmang;
import java.util.Scanner;

public class NhapXuatMang {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao so phan tu cua mang n : ");
        int n=sc.nextInt();
        int[] mangN= nhapMang(n);
        System.out.println("mang vua nhap la : ");
        xuatMang(mangN);



    }
    //ham nhap mang
    public static int [] nhapMang(int n){
        Scanner sc=new Scanner(System.in);
        int [] mang=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("a["+i+"]= ");
            mang[i]=sc.nextInt();
        }
        return mang;
    }
    //ham xuat mang
    public static void xuatMang(int [] mang){
        for(int i=0;i<mang.length;i++)
            System.out.print(mang[i]+" ");
    }
}
