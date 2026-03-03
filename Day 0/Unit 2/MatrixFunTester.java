public class MatrixFunTester {
    public static void main(String[] args) {
        MatrixFun mat = new MatrixFun(3, 3);
        MatrixFun mat2 = new MatrixFun(3, 3);
        // mat2.setMatrix(mat.getMatrix());
        System.out.println(mat.toString());
        mat.replaceAll(1, 9);
        // System.out.println(mat2.toString());
        System.out.println(mat.toString());
        mat.swapRow(0, 1);
        System.out.println(mat.toString());

        // System.out.println(mat.equals(mat2));

        // int[][] mat3 = { { 1, 2, 3 }, { 4, 5, 6 } };
        // System.out.println(mat.equals(mat3));

    }
}