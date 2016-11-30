/**
 * Created by Lena on 28.11.2016.
 */
public class Rectangle extends Shape implements Comparable{
    private double width, height;
    public Rectangle(String shapeColor, double width, double height) {
        super(shapeColor);
        this.width = width;
        this.height = height;
    }
    @Override
    public double calcArea(){
        return this.width*this.height;
    }

    @Override
    public String toString() {
        return super.toString() + ",width=" + width + ", height=" + height;
    }
    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        int result;
        Rectangle rectangle = (Rectangle)o;
        if(rectangle.calcArea()>this.calcArea()){
            result = -1;
        }else if(rectangle.calcArea()<this.calcArea()){
            result = 1;
        }else result = 0;

        return result;
    }

}