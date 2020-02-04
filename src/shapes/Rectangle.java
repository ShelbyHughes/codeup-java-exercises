package shapes;

public class Rectangle {
    protected long length;
    protected long width;

    public Rectangle(long length, long width){
        this.length = length;
        this.width = width;
    }

    public long getArea(){
        return this.length * this.width;
    }

    public long getPerimeter(){
        return 2 * this.length + 2 * this.width;
    }
}
