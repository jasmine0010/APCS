import java.util.*;

public class ItemCalculator {    
    public static void printData(ArrayList<Item> items) {
        for (Item i: items)
            System.out.println(i.getName() + " " + i.getPrice() + "\n");
    }
    
    public static float getAveragePrice(ArrayList<Item> items) {
        float sum = 0;
        
        for (Item i: items) sum += i.getPrice();
        
        return sum / items.size();
    }
    
    public static String getExpensive(ArrayList<Item> items) {
        float max = 0;
        String name = "";
        
        for (Item i: items)
            if (i.getPrice() >= max) {
                max = i.getPrice();
                name = i.getName();
            }
        
        return name;
    }
    
    public static void main(String args[]) {
        ArrayList<Item> items = new ArrayList<Item>();
        items.add(new Item("Apple", 5));
        items.add(new Item("Bag", 300));
        items.add(new Item("Computer", 3000));
        
        printData(items);
        System.out.println("Average: " + getAveragePrice(items) + "  Most Expensive: " + getExpensive(items));
    }
}