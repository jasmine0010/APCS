public class TestRectangle {
    public static void main(String[] args) {
        Rectangle[][] rectangles = {{new Rectangle("Rect", 1, 4), new Rectangle("Rect", 6, 4)}, {new Rectangle("Rect", 10, 3), new Rectangle("Rect", 9, 11)}};

        System.out.println("Perimeter:");
        
        for (Rectangle[] rects: rectangles) {
            for (Rectangle r: rects) {
                System.out.print(r.getPerimeter() + " ");
            }
            System.out.println();
        }
        
        System.out.println("Average Perimeter: " + Rectangle.getAvgPerimeter(rectangles) + "\n\nArea:");
        
        for (Rectangle[] rects: rectangles) {
            for (Rectangle r: rects) {
                System.out.print(r.getArea() + " ");
            }
            System.out.println();
        }
        
        System.out.println("Greatest area: " + Rectangle.rectWithMaxArea(rectangles).getArea());
    }
}