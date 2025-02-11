public class Arrays2DComputation {
    public static int smallestInArray(int[][] intArray) {
        int smallest = Integer.MAX_VALUE;
        
        for (int[] ints: intArray) {
            for (int i: ints) {
                if (i < smallest) smallest = i;
            }
        }
        
        return smallest;
    }
    
    public static float sumOfArray(float[][] floatArray) {
        float sum = 0;
        
        for (float[] floats: floatArray) {
            for (float f: floats) {
                sum += f;
            }
        }
        
        return sum;
    }
    
    public static int startWithA(String[][] stringArray) {
        int count = 0;
        
        for (String[] strings: stringArray) {
            for (String s: strings) {
                if (s.substring(0, 1).equals("A")) count++;
            }
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        int[][] intArray = {{20, 3, 9}, {35, 2, 19}, {45, 12, 23}};
        
        System.out.println("Smallest int: " + smallestInArray(intArray) + "\n");
        
        float[][] floatArray = {{20, 3, 9}, {35, 2, 19}, {45, 12, 23}};
        
        System.out.println("Sum: " + sumOfArray(floatArray) + "\n");
        
        String[][] stringArray = {{"Apple", "Pear", "Banana"}, {"Strawberry", "Kiwi", "Avocado"}};
        
        System.out.println("Start with A: " + startWithA(stringArray));
    }
}