public class FunWith2DArrays {
    public static int totalElements(int[][] array){
        int rows = array.length; 
        int columns = array[0].length; 
        return rows * columns;
    }

    public static void fourCorners(String[][] array){
        int rows = array.length; 
        int columns = array[0].length;

        System.out.println(array[0][0]); 
        System.out.println(array[0][columns - 1]); 
        System.out.println(array[rows - 1][0]); 
        System.out.println(array[rows - 1][columns - 1]); 
    }

    public static void swapFrontAndBackRows(String[][] array){
        String[] firstRow = array[0]; 
        array[0] = array[array.length - 1]; 
        array[array.length - 1] = firstRow; 
    }

    
}
