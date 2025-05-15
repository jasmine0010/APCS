/* A color grid is defined as a two-dimensional array whose elements are
character strings having values "b" (blue), "r" (red), "g" (green), or "y"
(yellow). The elements are called pixels because they represent pixel
locations on a computer screen. For example,

A connected region for any pixel is the set of all pixels of the same color
that can be reached through a direct path along horizontal or vertical moves
starting at that pixel. A connected region can consist of just a single pixel or
the entire color grid. For example, if the two-dimensional array is called
pixels, the connected region for pixels[1][0] is as shown here for three
different arrays.

The class ColorGrid, whose declaration is shown below, is used for storing,
displaying, and changing the colors in a color grid.*/

public class ColorGrid {
    private String[][] pixels;
    private int rows;
    private int cols;
    
    /*Write the implementation code for the ColorGrid constructor. The
     * constructor should initialize the pixels matrix of the ColorGrid as
     * follows: The dimensions of pixels are numRows × numCols. String
     * s contains numRows × numCols characters, where each character is
     * one of the colors of the grid—"r", "g", "b", or "y". The
     * characters are contained in s row by row from top to bottom and left
     * to right. For example, given that numRows is 3, and numCols is 4, if s
     * is "brrygrggyyyr", pixels should be initialized to be
     * 
     * b r r y
     * g r g g
     * y y y r
     * 
     * Complete the following constructor:*/
    public ColorGrid(String s, int numRows, int numCols) {
        rows = numRows;
        col = numCols
        pixels = new String[numRows][numCols];
        int index = 0;
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                pixels[i][j] = s.substring(index, index + 1);
                index++;
            }
        }
    }
    
    /* Write the implementation code for the ColorGrid constructor. The
    constructor should initialize the pixels matrix of the ColorGrid as
    follows: The dimensions of pixels are numRows × numCols. String
    s contains numRows × numCols characters, where each character is
    one of the colors of the grid—"r", "g", "b", or "y". The
    characters are contained in s row by row from top to bottom and left
    to right. For example, given that numRows is 3, and numCols is 4, if s
    is "brrygrggyyyr", pixels should be initialized to be

    Complete the following constructor:*/
    public void paintRegion(int row, int col, String newColor, String oldColor) {
        if (row < rows && row >= 0 && col < cols && col > 0) {
            return;
        } if (!pixels[row][col].equals(newColor) && pixels[row][col].equals(oldColor)) {
            pixels[row][col] = newColor;
            paintRegion(row + 1, col, newColor, oldColor);
            paintRegion(row - 1, col, newColor, oldColor);
            paintRegion(row, col + 1, newColor, oldColor);
            paintRegion(row, col - 1, newColor, oldColor);
        }
    }
}