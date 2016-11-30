/**
 * Created by Lena on 28.11.2016.
 */
public abstract class Shape implements Drawable{
    private String shapeColor;

    public Shape(String shapeColor) {
        this.shapeColor = shapeColor;
    }

    public abstract double calcArea();

    @Override
    public String toString() {
        return "This is " + this.getClass().getSimpleName() + ", color is: " + shapeColor;
    }

    public String getShapeColor() {
        return shapeColor;
    }

    public void setShapeColor(String shapeColor) {
        this.shapeColor = shapeColor;
    }
}


