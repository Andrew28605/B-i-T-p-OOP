package Bai1_a_Circle;

public class Test {
	public static void main(String[] args) {
        // Tạo một đối tượng Circle
        Circle circle = new Circle(5.0);

        // In bán kính và diện tích
        System.out.println("Bán kính: " + circle.getRadius());
        System.out.println("Diện tích: " + circle.getArea());

        // Sử dụng phương thức toString
        System.out.println(circle.toString());

        // Thay đổi bán kính và kiểm tra lại
        circle.setRadius(7.5);
        System.out.println("Bán kính mới: " + circle.getRadius());
        System.out.println("Diện tích mới: " + circle.getArea());
        System.out.println(circle.toString());
    }
}