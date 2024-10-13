class StringSplosion {
    public static String stringSplosion(String str) {
      String newStr = "";
      for (int i = 0; i < str.length(); i ++) {
        for (int j = 0; j < i + 1; j ++) {
          newStr += str.substring(j, j + 1);
        }
      }
      return newStr;
    }
    
    public static void testStringSplosion(String str, String expected) {
        String result = stringSplosion(str);
        
        System.out.print("String: " + str + "  Expected: " + expected + "  Result: " + result);
        
        if (result.equals(expected)) System.out.println("  Correct.");
        else System.out.println("  Incorrect.");
    }
    
    public static void main(String args[]) {
        testStringSplosion("Code", "CCoCodCode");
        testStringSplosion("There", "TThTheTherThere");
        testStringSplosion("abc", "aababc");
    }
}