package Bai1_c_DsHtRandom;
import java.util.Random;

public class Test {
	public static void main(String[] args) {
        // Tạo danh sách các hình tròn với bán kính ngẫu nhiên
        CircleCollection collection = new CircleCollection();
        Random random = new Random();
        int numberOfCircles = 10; // Số lượng hình tròn

        // Tạo các hình tròn với bán kính ngẫu nhiên từ 1 đến 10
        for (int i = 0; i < numberOfCircles; i++) {
            double radius = 1 + random.nextDouble() * 9; // Random bán kính từ 1 đến 10
            collection.addCircle(new Circle(radius));
        }

        // Hiển thị thông tin các hình tròn trong danh sách
        System.out.println("Danh sách các hình tròn:");
        System.out.println(collection);

        // Tính tổng diện tích các hình tròn
        System.out.println("Tổng diện tích: " + collection.calcSumArea());

        // Hiển thị diện tích lớn nhất
        System.out.println("Diện tích lớn nhất: " + collection.findMaxArea());

        // Tìm và hiển thị thông tin của hình tròn có diện tích nhỏ nhất
        Circle minCircle = collection.findCircleWithMinArea();
        int minIndex = collection.getIndexOfCircle(minCircle);
        System.out.println("Hình tròn có diện tích nhỏ nhất:");
        System.out.println("Vị trí: " + minIndex + ", Bán kính: " + minCircle.getRadius());
    }
}
