package shapes;

public class Square extends Quadrilateral{
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength() {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth() {
        this.width = width;
        this.length = width;
    }

    public double getArea(){
        return 4 * this.length;
    }

    public double getPerimeter(){
        return this.length * this.width;
    }
}
