package U8T2;

public class FunWith2DArrays {
    public static double average(int[][] array){
        double sum = 0;
        for (int[] row : array){
            for (int column : row){
                sum+=column; 
            }
        }
        return sum/(array.length * array[0].length); 
    }

    public static int edgeSum(int[][] array){
        int sum = 0; 
        for (int firstRow : array[0]){
            sum+=firstRow; 
        }
        for (int i = 1; i < array.length - 1; i++){
            sum+=array[i][0]; 
            sum+=array[i][array[0].length - 1]; 
        }
        for (int lastRow : array[array.length - 1]){
            sum+=lastRow; 
        }
        return sum; 
    }

    public static int[] indexFound(String[][] array, String target){
        int[] index = new int[2]; 
        for (int i = 0; i < array[0].length; i++){
            for (int j = 0; j < array.length; j++){
                if (array[j][i].equals(target)){
                    index[0] = j; 
                    index[1] = i; 
                    return index; 
                }
            }
        }
        index[0] = -1; 
        index[1] = -1; 
        return index; 
    }

    public static int[][] split(int[][] array, int row, int column){
        int[][] newArray = new int[row + 1][column + 1]; 
        if (row > array.length || column > array[0].length){
            return new int[0][0]; 
        }
        for (int i = 0; i < row; i++){
            for (int j = 0; j < column; j++){
                newArray[i][j] = array[i][j]; 
            }
        }
        return newArray; 
    }

    public static int[][] invert(int[][] array){
        int[][] inverted = new int[array[0].length][array.length]; 
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array[0].length; j++){
                inverted[j][i] = array[i][j]; 
            }
        }
        return inverted; 
    }
}


