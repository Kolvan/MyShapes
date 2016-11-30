/**
 * Created by Lena on 28.11.2016.
 */
public class Triangle extends Shape implements Comparable {
    private double a,b,c;
    public Triangle(String shapeColor, double a, double b, double c) {
        super(shapeColor);
        this.a = a;
        this.b = b;
        this.c = c;
    }
    @Override
    public double calcArea(){
        double s = (a + b + c)/ 2;
        double area = Math.sqrt(s*(s - this.a)*(s - this.b)*(s - this.c));
        return area;
    }

    @Override
    public String toString() {
        return super.toString() + ", a=" + this.getA() +", b=" + this.getB() + ", c=" + this.getC();
    }
    @Override
    public void draw() {
        System.out.println(this.toString() + ", area is: " + this.calcArea());
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    @Override
    public int compareTo(Object o) {
        int result;

        Triangle triangle = (Triangle) o;
        if(triangle.calcArea()>this.calcArea()){
            result = -1;
        }else if(triangle.calcArea()<this.calcArea()){
            result = 1;
        }else result = 0;

        return result;
    }

}