import java.util.List;

public class ShapeUtil {
    /**
     * bla.
     */
    public String printInfo(List<GeometricObject> shapes) {
        String result = "Circle:\n";
        for (GeometricObject g : shapes) {
            if (g.getClass() == Circle.class) {
                result += g.getInfo();
                result += "\n";
            }
        }
        result += "Triangle:\n";
        for (GeometricObject g : shapes) {
            if (g.getClass() == Triangle.class) {
                result += g.getInfo();
                result += "\n";
            }
        }

        return result;
    }
}
