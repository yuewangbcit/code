package code.java101.arrays;

/**
 * Matrix.
 *
 * @author BCIT
 * @version 2020
 */
public class Matrix {

    private final int[][] matrix;

    /**
     * Constructs an object of type Matrix.
     *
     * @param rows    an int
     * @param columns an int
     */
    public Matrix(int rows, int columns) { matrix = new int[rows][columns]; }

    /**
     * Returns the number of rows in this Matrix.
     *
     * @return rows as an int
     */
    public int getRows() {
        return matrix.length;
    }

    /**
     * Returns the number of columns in this Matrix.
     *
     * @return columns as an int
     */
    public int getColumns() {
        return matrix[0].length;
    }

    /**
     * Returns the value stored at the specified row and column.
     *
     * @param row    an int
     * @param column an int
     * @return value at that location in this Matrix.
     */
    public int getValue(int row, int column) {
        return matrix[row][column];
    }

    /**
     * Puts the specified value in the specified location.
     *
     * @param value  an int
     * @param row    an int
     * @param column an int
     */
    public void setValue(int value, int row, int column) {
        matrix[row][column] = value;
    }

    /**
     * Returns a new matrix which is the sum of this matrix and the matrix
     * passed as a parameter. If the matrix passed as a parameter is the wrong
     * size, this method throws an IllegalArgumentException.
     *
     * @param otherMatrix a Matrix, possibly the wrong size
     * @return sumMatrix a new Matrix
     */
    public Matrix add(Matrix otherMatrix) {
        if (this.getRows() != otherMatrix.getRows()
                || this.getColumns() != otherMatrix.getColumns()) {
            throw new IllegalArgumentException("Wrong size. Cannot be added");
        } else {
            Matrix sumMatrix = new Matrix(this.getRows(), this.getColumns());
            for (int row = 0; row < this.getRows(); ++row) {
                for (int column = 0; column < this.getColumns(); ++column) {
                    int sum = this.getValue(row, column)
                            + otherMatrix.getValue(row, column);
                    sumMatrix.setValue(sum, row, column);
                }
            }
            return sumMatrix;
        }
    }

    /**
     * Returns a String representation of this Matrix.
     *
     * @return description
     * @see Object#toString()
     */
    @Override
    public String toString() {
        String thisMatrix = "";
        for (int i = 0; i < matrix.length; ++i) {
            for (int j = 0; j < matrix[0].length; ++j) {
                thisMatrix += matrix[i][j] + " ";
            }
            thisMatrix += "\n";
        }
        return thisMatrix;
    }

    /**
     * Matrices are equal if they are the same size and contain
     * the same values in the same cells.
     *
     * @param other Object
     */
    @Override
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (this == other) {
            return true;
        }
        if (!this.getClass().equals(other.getClass())) {
            return false;
        }
        Matrix otherMatrix = (Matrix) other;
        for (int row = 0; row < this.getRows(); ++row) {
            for (int column = 0; column < this.getColumns(); ++column) {
                if (this.getValue(row, column)
                        != otherMatrix.getValue(row, column)) {
                    return false;
                }
            }
        }
        return true;
    }

}
