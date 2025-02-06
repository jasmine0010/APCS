public class TestVector {
    public static void main(String args[]) {
        Vector vector = new Vector(3, 4);
        
        System.out.println("X: " + vector.getX() + "  Y: " + vector.getY());
        System.out.println("Magnitude: " + vector.getMagnitude() + "  Direction: " + vector.getDirection());
        
        vector.add(new Vector(2, 3));
        System.out.println("Add (2, 3).  New vector: (" + vector.getX() + ", " + vector.getY() + ")");
        
        vector.scalarMultiply(3);
        System.out.println("Multiply by scalar: 3.  New vector: (" + vector.getX() + ", " + vector.getY() + ")");
        
        System.out.println("Dot product with (4, 5): " + vector.dotProduct(new Vector(4, 5)));
        System.out.println("Angle between vector and (15, 9): " + vector.angle(new Vector(15, 9)));
    }
}