class CountOccurrences {
    public static int countOccurrences(String str, String subStr) {
        int count = 0;
        
        for (int i = 0; i < str.length() - subStr.length() + 1; i ++) {
            if (str.substring(i, i + subStr.length()).equals(subStr)) {
                count ++;
            }
        }
        
        return count;
    }
    
    public static void testCountOccurrences(String str, String subStr, int expected) {
        int result = countOccurrences(str, subStr);
        
        System.out.print("String: " + str + "  Substring: " + subStr + "  Expected: " + expected + "  Result: " + result);
        
        if (result == expected) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testCountOccurrences("Mississippi", "iss", 2);
        testCountOccurrences("banananana", "na", 4);
        testCountOccurrences("Apple", "p", 2);
        testCountOccurrences("programming", "ig", 0);
    }
}