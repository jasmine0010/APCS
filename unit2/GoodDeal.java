public class GoodDeal {
    public static boolean goodDeal(double originalPrice, double salePrice) {
        if (originalPrice * 0.75 > salePrice) return true;
        return false;
    }
    
    public static void testGoodDeal(double originalPrice, double salePrice, boolean expected) {
        boolean result = goodDeal(originalPrice, salePrice);
        
        System.out.print("Original: " + originalPrice + "  Sale: " + salePrice + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String[] args) {
        testGoodDeal(10, 8, false);
        testGoodDeal(6.5, 3, true);
        testGoodDeal(58, 43.5, false);
    }
}