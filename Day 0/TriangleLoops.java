public class TriangleLoops {
    public static String createLetterTriangleUp(int numberOfRows, char letter) {
        String s = "";
        for (int i = 0; i < numberOfRows; i++) {
            for (int x = 0; x <= i; x++) {
                s = s + letter;
            }
            s = s + "\n";
            
        }
        return s;
    }
    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the row number. The total number of rows printed
     * is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */

    // to-do: implement createLetterTriangleUp

    /*
     * The method returns a String by creating rows of letters. Each row prints a
     * number of letters equal to the total number of rows, descending downward. The
     * total number of rows printed is determined by numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @param letter the letter to be printed
     * @return a String of letters in the shape of a triangle
     */
    // to-do: implement createLetterTriangleDown
    public static String createLetterTriangleDown(int numberOfRows, char letter) {
        String triangle = "";
        for (int i = numberOfRows; i > 0; i--) {
            for (int y = i; y > 0; y--) {
                triangle = triangle + letter;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }

    /*
     * This method returns a String of a number triangle. The number of rows in the
     * triangle is determined by the numberOfRows, and the number used in each row
     * is determined by the row number.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of numbers in the shape of a triangle
     */
    // to-do: implement createNumbersTriangle
    public static String createNumbersTriangle(int numberOfRows) {
        String triangle = "";
        for (int i = 1; i <= numberOfRows; i++) {
            triangle = triangle + "\n";
            for (int z = 1; z <= i; z++) {
                triangle = triangle + i + " ";
            }
        }
        return triangle;
    }

    /*
     * The method returns a String by creating a pyramid pattern using the alphabet.
     * The method determines the height of the pyramid by using the int
     * numberOfRows.
     * @param numberOfRows the number of rows in the triangle
     * @return a String of letters in the shape of a pyramid
     */
    // to-do: implement createAlphabetTriangle
    public static String createAlphabetTriangle(int numberOfRows) {
        String triangle = "";
        if (numberOfRows > 26 || numberOfRows < 0) {
            numberOfRows = 26;
        } 
        for (int i = 1; i <= numberOfRows; i++) {
            for (int j = 0; j < numberOfRows - i; j++) { //spaces
                triangle = triangle + " ";
            }
            for (char c = 'A'; c < 'A' + i; c++) { //letters going up
                triangle = triangle + c;
            }
            for (char c = (char) ('A' + i - 2); c >= 'A'; c--) { //letters going down
                triangle = triangle + c;
            }
            triangle = triangle + "\n";
        }
        return triangle;
    }


}