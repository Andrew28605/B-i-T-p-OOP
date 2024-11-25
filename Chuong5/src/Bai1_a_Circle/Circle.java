package Bai1_a_Circle;

public class Circle {
	private double radius;

    // Hàm khởi tạo
    public Circle(double radius) {
        this.radius = radius;
    }

    // Getter cho bán kính
    public double getRadius() {
        return radius;
    }

    // Setter cho bán kính
    public void setRadius(double radius) {
        this.radius = radius;
    }

    // Phương thức tính diện tích
    public double getArea() {
        return Math.PI * radius * radius;
    }

    // Ghi đè phương thức toString
    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", area=" + getArea() + "]";
    }
}