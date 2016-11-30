/**
 * Created by Lena on 28.11.2016.
 */
public class Circle extends Shape implements Comparable{
    private double radius;
    public Circle(String shapeColor, double radius) {
        super(shapeColor);
        this.radius = radius;
    }
    @Override
    public double calcArea(){
        return this.radius*this.radius*Math.PI;
    }

    @Override
    public String toString() {
        return super.toString() + ", radius=" + (int)this.radius;
    }

    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    @Override
    public int compareTo(Object o) {
        int result;

        Circle circle = (Circle)o;
        if(circle.calcArea()>this.calcArea()){
            result = -1;
        }else if(circle.calcArea()<this.calcArea()){
            result = 1;
        }else result = 0;

        return result;
    }
}