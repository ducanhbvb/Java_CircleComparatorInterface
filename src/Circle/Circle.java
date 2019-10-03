package Circle;

import java.lang.reflect.Method;

public class Circle extends CircleComparator {
    private double radius = 1.0;
    private String color = "blue";
    private boolean fill = false;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(double radius, String color, boolean fill) {
        this.radius = radius;
        this.color = color;
        this.fill = fill;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFill() {
        return fill;
    }

    public void setFill(boolean fill) {
        this.fill = fill;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                ", fill=" + isFill() +
                '}';
    }
}
