import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

public class Layer {
    private List<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    /**
     * Function.
     */
    public void removeCircles() {
        for (int i  = shapes.size() - 1; i >= 0; i--) {
            if (shapes.get(i) instanceof Circle) {
                shapes.remove(i);
            }
        }
    }

    /**
     * Function.
     */
    public String getInfo() {
        String info = "Layer of crazy shapes:\n";
        for (Shape shape : shapes) {
            info += shape.toString() + "\n";
        }

        return info;
    }

    /**
     * Function.
     */
    public void removeDuplicates() {
        LinkedHashSet<Shape> uniqueShapes = new LinkedHashSet<>(shapes);
        shapes.clear();
        shapes.addAll(uniqueShapes);
    }
}
