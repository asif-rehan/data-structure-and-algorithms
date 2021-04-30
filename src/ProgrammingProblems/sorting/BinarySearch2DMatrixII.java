package ProgrammingProblems.sorting;

public class BinarySearch2DMatrixII {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;
        while ((r<=matrix.length - 1) && c >=0){
            if (matrix[r][c]== target) {
                return true;
            } else if (matrix[r][c] < target) {
                r++;
            } else{
                c--;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1, 4, 7, 11, 15},
                                    { 2, 5, 8, 12, 19},
                                    { 3, 6, 9, 16, 22},
                                    {10,13,14, 17, 24},
                                    {18,21,23, 26, 30}};
        BinarySearch2DMatrixII binarySearch2DMatrix = new BinarySearch2DMatrixII();
        System.out.println(binarySearch2DMatrix.searchMatrix(matrix, 5));
        System.out.println(binarySearch2DMatrix.searchMatrix(matrix, 20));
        matrix = new int[][]{{-1,3}};
        System.out.println(binarySearch2DMatrix.searchMatrix(matrix, 3));
    }
}
