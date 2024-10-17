public class TestRectangle {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(3, 4);
        
        System.out.println("Base: " + rect.getBase());
        System.out.println("Height: " + rect.getHeight());
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());
        System.out.println("Diagonal: " + rect.getDiagonal());
    }
}