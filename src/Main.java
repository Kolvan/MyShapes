import java.text.DecimalFormat;
/*

*
 * Created by Lena on 28.11.2016.

*/

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle("RED", 10);
        System.out.println(circle.toString());
        System.out.println(circle.getClass().getSimpleName() + " area is:" + (float)circle.calcArea());
        System.out.println("");
        Rectangle rectangle = new Rectangle("BLACk", 11 , 22);
        System.out.println(rectangle.toString());
        System.out.println("Shape area is:" + (int)rectangle.calcArea());
        System.out.println("");
        Triangle triangle = new Triangle("ORANGE" , 5, 5, 5);
        System.out.println(triangle.toString());
        System.out.printf("Shape area is: %.3f", triangle.calcArea());
        System.out.println("");
        System.out.println("");
        Shape[] arr = new Shape[9];
        arr[0] = new Rectangle("White", 10, 11);
        arr[1] = new Rectangle("Black", 12, 17);
        arr[2] = new Rectangle("Green", 15, 10);
        arr[3] = new Rectangle("Red", 2, 18);
        arr[4] = new Rectangle("Orange", 8, 25);
        arr[5] = new Circle("White", 10);
        arr[6] = new Circle("Black", 12);
        arr[7] = new Triangle("Red", 6, 6, 6);
        arr[8] = new Triangle("Brown", 8, 7, 6);
        for (Shape shape: arr){
            System.out.println(shape.toString() + ", area is:" + shape.calcArea());
        }
        System.out.println("");

        System.out.println("Rectangle total area: " + Main.sumRectangleArea(arr));
        System.out.println("Triangle total area: " + Main.sumTriangleArea(arr));
        System.out.println("Circle total area: " + Main.sumCircleArea(arr));




    }
    public static double sumArea(Shape[] shapes){
        double sum = 0;
        for (Shape shape2: shapes){
            sum = sum + shape2.calcArea();
        }
        return sum;
    }
    public static double sumCircleArea(Shape[] shapes){
        double sum = 0;

        for (Shape shape2: shapes){
            if(shape2 instanceof Circle)
                sum = sum + shape2.calcArea();
        }
        return sum;
    }
    public static double sumRectangleArea(Shape[] shapes){
        double sum = 0;

        for (Shape shape2: shapes){
            if(shape2 instanceof Rectangle)
                sum = sum + shape2.calcArea();
        }
        return sum;
    }
    public static double sumTriangleArea(Shape[] shapes){
        double sum = 0;

        for (Shape shape2: shapes){
            if(shape2 instanceof Triangle)
                sum = sum + shape2.calcArea();
        }
        return sum;
    }
}