package B1_chia_cho_0;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("nhap vao so a : ");
        int a = sc.nextInt();
        System.out.println("nhap vao so b : ");
        int b = sc.nextInt();

        try {
            if (b == 0)
                throw new Exception("Không thể chia cho 0");
            float c = (float) a / b;
            System.out.println("kq= " + c);

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
