package categories.creational.Abstract_factory;
/**
 * Create Factory classes ColorFactory extending AbstractFactory to generate object of concrete class based on given information.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class ColorFactory extends AbstractFactory {
    @Override
    Shape getShape(String shape) {
        return null;
    }

    @Override
    Color getColor(String color) {

        if (color == null) {
            return null;
        }
        else if ("Red".equalsIgnoreCase(color)) {
            return new Red();
        }
        else if ("Green".equalsIgnoreCase(color)) {
            return new Green();
        }
        else if ("Blue".equalsIgnoreCase(color)) {
            return new Blue();
        }

        return null;
    }
}
