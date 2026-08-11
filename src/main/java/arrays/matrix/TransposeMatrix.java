package arrays.matrix;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {

        int rows = matrix.length;
        int columns = matrix[0].length;

        int[][] result = new int[columns][rows];

        for (int row = 0; row < rows; row++) {

            for (int col = 0; col < columns; col++) {

                result[col][row] = matrix[row][col];
            }
        }

        return result;
    }
}
