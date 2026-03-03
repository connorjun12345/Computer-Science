public class MatrixFun {
    private int[][] matrix;

    public MatrixFun(int numberOfRows, int numberOfCols) {
        if (numberOfRows <= 0 || numberOfCols <= 0) {
            throw new IllegalArgumentException("Rows and Columns must be greater than 0");
        }
        this.matrix = new int[numberOfRows][numberOfCols];
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[row].length; col++) {
                int x = (int) (Math.random() * 9) + 1;
                matrix[row][col] = x;
            }
        }
    }

    public MatrixFun(int[][] starterMatrix) {
        this.matrix = starterMatrix;
    }

    public MatrixFun() {
        this(3, 3);
    }

    public int[][] getMatrix() {
        return matrix;
    }

    public void setMatrix(int[][] matrix) {
        this.matrix = matrix;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < (matrix.length * 2) - 1; i++) {
            result = result + "=";
        }
        result += "\n";
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                result += matrix[i][j] + " ";
            }
            result += "\n";
        }
        for (int i = 0; i < (matrix.length * 2) - 1; i++) {
            result = result + "=";
        }
        result += "\n";
        return result;
    }

    public boolean equals(MatrixFun other) {
        if (matrix.toString().equals(other.matrix.toString())) {
            return true;
        } else {
            return false;
        }
        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // if (matrix[i][j] != other.matrix[i][j]) {
        // return false;
        // }
        // }
        // }
        // return true;
    }

    public boolean equals(int[][] other) {
        if (matrix.length != other.length) {
            return false;
        }
        for (int i = 0; i < matrix.length; i++) {
            if (matrix[i].length != other[i].length) {
                return false;
            }
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] != other[i][j]) {
                    return false;
                }
            }
        }
        return true;

    }

    public void replaceAll(int oldValue, int newValue) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == oldValue) {
                    matrix[i][j] = newValue;
                }
            }
        }
    }

    public void swapRow(int rowA, int rowB) {
        if (rowA >= matrix.length || rowA < 0 || rowB >= matrix.length || rowB < 0) {
            throw new IllegalArgumentException("The index of Row A or Row B is invalid.");
        }
        int[] rowC = matrix[rowA];
        matrix[rowA] = matrix[rowB];
        matrix[rowB] = rowC;
    }

}