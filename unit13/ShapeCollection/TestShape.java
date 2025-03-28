public class TestShape {
    public static void main(String[] args) {
        ShapeCollection shapes = new ShapeCollection();
        
        shapes.addShape(new Shape("triangle", 3));
        shapes.addShape(new Shape("square", 4));
        shapes.addShape(new Shape("pentagon", 5));
        shapes.addShape(new Shape("hexagon", 6));
        
        System.out.println("Average sides: " + shapes.averageSides() + "\n\nEven sides:");
        
        for (Shape s: shapes.evenSides()) {
            System.out.print(s.getName() + " " + s.getSides() + "\n");
        }
    }
}