package shapes;

public class Square extends Quadrilateral{
    protected double side;

    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength() {
        this.length = side;
    }

    @Override
    public void setWidth() {
        this.width = side;
    }

    public double getArea(){
        return 4 * this.length;
    }

    public double getPerimeter(){
        return this.length * this.width;
    }
}
