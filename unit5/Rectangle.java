public class Rectangle {
    private double base;
    private double height;
    
    public Rectangle(double baseIn, double heightIn) {
        base = baseIn;
        height = heightIn;
    }
    
    public double getBase() {
        return base;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getArea() {
        return base * height;
    }
    
    public double getPerimeter() {
        return (base + height) * 2;
    }
    
    public double getDiagonal() {
        return Math.sqrt(base * base + height * height);
    }
}