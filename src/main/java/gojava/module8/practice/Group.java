package gojava.module8.practice;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group<T extends Shape> {

    private List<T> shapes = new ArrayList<>();

    public void add(T shape) {
        shapes.add(shape);
    }

    public List<T> getAll() {
        return shapes;
    }

    public double getSumArea() {
        double sum = 0;
        for (T shape : shapes) {
            sum += shape.getArea();
        }
        return new BigDecimal(sum).setScale(2, BigDecimal.ROUND_HALF_UP).doubleValue();
    }

    /*public Map<Class<? extends Shape>, Group<T>> shapesSeparatedByType() {
        Map<Class<? extends Shape>, Group<T>> map = new HashMap<>();
        for (T shape : shapes) {
            Class<? extends Shape> aClass = shape.getClass();
            if(map.get(aClass) == null) {
                map.put(aClass, new Group());

                map.get(aClass).add(shape);
            }
        }
    }*/

    /*public Group<T> shapesSeparatedByType(Class<T> clazz) {

    }*/
}
