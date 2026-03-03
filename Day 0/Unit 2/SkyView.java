public class SkyView {
    private double[][] view;

    public SkyView(int numberOfRows, int numberOfCols, double[] scanned) {
        if (scanned == null) {
            throw new IllegalArgumentException("Array is null");
        }
        if (numberOfCols * numberOfRows < scanned.length) {
            throw new IllegalArgumentException("Not enough room");
        }
        view = new double[numberOfRows][numberOfCols];
        int index = 0;
        for (int i = 0; i < numberOfRows; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < numberOfCols; j++) {
                    view[i][j] = scanned[index];
                    index++;
                }
            } else {
                for (int j = numberOfCols - 1; j >= 0; j--) {
                    view[i][j] = scanned[index];
                    index++;
                }
            }

        }
    }

    public double[][] getView() {
        return view;
    }

    public void setView(double[][] view) {
        this.view = view;
    }

    public String toString() {
        String result = "";
        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                result += view[i][j] + " ";
            }
            result += "\n";
        }
        return result;
    }

    public boolean equals(SkyView other) {
        if (other == null) {
            return false;
        }

        if (this.view.length != other.view.length) {
            return false;
        }

        if (this.view[0].length != other.view[0].length) {
            return false;
        }

        for (int i = 0; i < view.length; i++) {
            for (int j = 0; j < view[i].length; j++) {
                if (this.view[i][j] != other.view[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    public double getAverage(int startRow, int endRow, int startCol, int endCol) {
        double sum = 0.0;
        int count = 0;

        for (int i = startRow; i <= endRow; i++) {
            for (int j = startCol; j <= endCol; j++) {
                sum += view[i][j];
                count++;
            }
        }

        return sum / count;
    }

}