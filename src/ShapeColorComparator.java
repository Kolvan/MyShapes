/*
*
 * Created by Lena on 30.11.2016.

*/

import java.util.Comparator;

public class ShapeColorComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        int result;
        if(o1 instanceof Shape && o2 instanceof Shape) {
            Shape shape1 = (Shape) o1;
            Shape shape2 = (Shape) o2;
            if (shape1.getShapeColor().length() < shape2.getShapeColor().length()) {
                result = 1;
            } else if (shape1.getShapeColor().length() > shape2.getShapeColor().length()) {
                result = -1;
            } else {
                result = 0;
            }
        }else result = 0;
        return result;
    }
}
