import java.util.*;

public class ShapeCollection {
    private ArrayList<Shape> shapes;
    
    public ShapeCollection() {
        shapes = new ArrayList<Shape>();
    }
    
    public void addShape(Shape s) {
        shapes.add(s);
    }
    
    public int numberOfSides(String shapeName) {
        if (shapeName.equals("triangle")) return 3;
        else if (shapeName.equals("square") || shapeName.equals("rectangle")) return 4;
        else if (shapeName.equals("pentagon")) return 5;
        else if (shapeName.equals("hexagon")) return 6;
        else if (shapeName.equals("heptagon")) return 7;
        else if (shapeName.equals("octagon")) return 8;
        else if (shapeName.equals("nonagon")) return 9;
        else if (shapeName.equals("decagon")) return 10;
        else if (shapeName.equals("hendecagon")) return 11;
        else if (shapeName.equals("dodecagon")) return 12;
        return -1;
    }
    
    public double averageSides() {
        double sum = 0;
        for (Shape s: shapes) sum += s.getSides();
        
        return sum / shapes.size();
    }
    
    public ArrayList<Shape> evenSides() {
        ArrayList<Shape> result = new ArrayList<Shape>();
        for (Shape s: shapes) {
            if (s.getSides() % 2 == 0) result.add(s);
        }
        
        return result;
    }
}