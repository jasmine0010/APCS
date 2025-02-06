public class Vector {
    private double x, y;
    
    public Vector(double xIn, double yIn) {
        x = xIn;
        y = yIn;
    }
    
    public double getX() {
        return x;
    }
    
    public double getY() {
        return y;
    }
    
    public double getMagnitude() {
        return Math.sqrt(x * x + y * y);
    }
    
    public double getDirection() {
        return Math.atan2(y, x);
    }
    
    public void add(Vector u) {
        x += u.getX();
        y += u.getY();
    }
    
    public void scalarMultiply(double k) {
        x *= k;
        y *= k;
    }
    
    public double dotProduct(Vector u) {
        return (x * u.getX() + y * u.getY());
    }
    
    public double angle(Vector u) {
        return Math.acos(this.dotProduct(u) / (this.getMagnitude() * u.getMagnitude()));
    }
}