package b7_switchcase;
import java.util.Scanner;

public class SwitchCase {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap vao 2 so nguyen a va b : ");
        int a= sc.nextInt();
        int b=sc.nextInt();
        int tong=a+b;
        int hieu=a-b;
        int tich=a*b;
        float thuong=(float)a/b;
        System.out.println("nhap vao ki tu(A,S,M,D): ");
        String nhap= sc.next();
        switch(nhap){
            case "A":
                System.out.println("tong 2 so la : "+tong);
                break;
            case "S":
                System.out.println("hieu 2 so la : "+hieu);
                break;
            case "M":
                System.out.println("tich 2 so la : "+tich);
                break;
            case "D":
                if(b==0){
                    System.out.println("khong the chia cho 0");
                }
                System.out.println("thuong 2 so la : "+thuong);
            break;
            default:
                System.out.println("Ky tu nhap khong hop le");
        }


    }
}
