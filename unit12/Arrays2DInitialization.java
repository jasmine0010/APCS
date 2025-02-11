public class Arrays2DInitialization {
    public static void main(String[] args) {
        int[][] diagArray = new int[10][10];
        
        for (int i = 0; i < diagArray.length; i++) {
            for (int j = 0; j < diagArray[i].length; j++) {
                if (i == j) System.out.print(1 + " ");
                else System.out.print(0 + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        String[][] stringArray = {{"One", "Two"}, {"Three", "Four"}};
        
        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < stringArray[i].length; j++) {
                System.out.print(stringArray[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        double[][] doubleArray = new double[5][5];
        
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[i].length; j++) {
                System.out.print(Double.parseDouble(Integer.toString(i + 1) + Integer.toString(j + 1)) + " ");
            }
            System.out.println();
        }
        System.out.println();
        
        
        int[][] intArray = new int[6][5];
        
        for (int i = 0; i < intArray.length; i++) {
            for (int j = 0; j < intArray[i].length; j++) {
                System.out.print((i + 1) + " ");
            }
            System.out.println();
        }
    }
}