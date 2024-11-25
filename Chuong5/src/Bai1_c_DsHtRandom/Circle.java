package Bai1_c_DsHtRandom;
import java.util.ArrayList;

public class Circle {
	private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }

    @Override
    public String toString() {
        return "Circle[radius=" + radius + ", area=" + getArea() + "]";
    }
}

// Lớp CircleCollection đã định nghĩa trước
class CircleCollection {
    private ArrayList<Circle> al;

    public CircleCollection() {
        al = new ArrayList<>();
    }

    public void addCircle(Circle c) {
        al.add(c);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < al.size(); i++) {
            sb.append("Vị trí ").append(i).append(": ").append(al.get(i).toString()).append("\n");
        }
        return sb.toString();
    }

    public double calcSumArea() {
        double sum = 0;
        for (Circle c : al) {
            sum += c.getArea();
        }
        return sum;
    }

    public Circle findCircleWithMinArea() {
        if (al.isEmpty()) {
            throw new IllegalStateException("Danh sách rỗng!");
        }
        Circle minCircle = al.get(0);
        for (Circle c : al) {
            if (c.getArea() < minCircle.getArea()) {
                minCircle = c;
            }
        }
        return minCircle;
    }

    public double findMaxArea() {
        if (al.isEmpty()) {
            throw new IllegalStateException("Danh sách rỗng!");
        }
        double maxArea = al.get(0).getArea();
        for (Circle c : al) {
            if (c.getArea() > maxArea) {
                maxArea = c.getArea();
            }
        }
        return maxArea;
    }

    public int getIndexOfCircle(Circle circle) {
        return al.indexOf(circle);
    }
}
