package shapes;

public class Square extends Rectangle{

    public Square(long side) {
        super(side, side);
    }
    public long getArea(){
        return 4 * this.length;
    }

    public long getPerimeter(){
        return this.length * this.width;
    }
}
