package shapes;

public class Circle {
    private static int circlesCreated = 0;
    private double radius;

    public Circle(double radius){
        this.radius = radius;
        circlesCreated++;
    }

    public double getArea(){
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference(){
        return 2 * Math.PI * this.radius;
    }
    public static int getCirclesCreated(){
        return circlesCreated;
    }
}
