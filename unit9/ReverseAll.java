public class ReverseAll {
    public static String[] reverseAll(String[] arr) {
        String[] newArr = new String[arr.length];
            
        for (int i = 0; i < arr.length; i++) {
            String newStr = "";
            newArr[i] = reverse(arr[i]);
        }
        
        return newArr;
    }
    
    public static String reverse(String str) {
        String newStr = "";
        
        for (int i = str.length() - 1; i >= 0; i--)
            newStr += str.substring(i, i + 1);
        
        return newStr;
    }
    
    public static void main(String[] args) {
        String[] arr1 = {"abcd", "xyz"};
        String[] arr2 = {"1234", "5678"};
        String[] arr3 = {"racecar", "tacocat", "izzi"};
        
        System.out.println("Results:");
        
        for (String str: reverseAll(arr1)) {
            System.out.print(str + " ");
        }
        
        System.out.println("");
        
        for (String str: reverseAll(arr2)) {
            System.out.print(str + " ");
        }
        
        System.out.println("");
        
        for (String str: reverseAll(arr3)) {
            System.out.print(str + " ");
        }
    }
}