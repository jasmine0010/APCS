/*a) Write a class Rectangle. Include the following:

private member variables for the name (String), width and height (doubles)

a constructor that sets these member variables

public accessor functions for the member variables

public functions to calculate the perimeter and area

b) Write a function that takes a 2D array of Rectangle objects as input and returns the average perimeter.

c) Write a function that takes a 2D array of Rectangle objects as input and returns the object with the greatest area.*/

public class Rectangle {
    private String name;
    private double width, height;
    
    public Rectangle(String name, double width, double height) {
        this.name = name;
        this.width = width;
        this.height = height;
    }
    
    public String getName() {
        return name;
    }
    
    public double getWidth() {
        return width;
    }
    
    public double getHeight() {
        return height;
    }
    
    public double getArea() {
        return width * height;
    }
    
    public double getPerimeter() {
        return (width + height) * 2;
    }
    
    public static double getAvgPerimeter(Rectangle[][] rectangles) {
        double perimeterSum = 0;
        int countRect = 0;
        
        for (Rectangle[] rects: rectangles) {
            for (Rectangle r: rects) {
                perimeterSum += r.getPerimeter();
                countRect++;
            }
        }
        
        return perimeterSum / countRect;
    }
    
    public static Rectangle rectWithMaxArea(Rectangle[][] rectangles) {
        double maxArea = 0;
        Rectangle rect = new Rectangle("Rect", 0, 0);
        
        for (Rectangle[] rects: rectangles) {
            for (Rectangle r: rects) {
                if (r.getArea() > maxArea) {
                    maxArea = r.getArea();
                    rect = r;
                }
            }
        }
        
        return rect;
    }
}