package shapes;

public class Circle {
    private double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        double area;
        area = Math.PI * (this.radius * this.radius);
        return area;
    }

    public double getCircumference(){
        double circumference;
        circumference = 2 * Math.PI * this.radius;
        return circumference;
    }
}
