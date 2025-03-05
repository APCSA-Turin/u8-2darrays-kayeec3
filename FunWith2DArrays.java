public class FunWith2DArrays {
        public static int totalElements(int[][] array) {
            int count = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++ ) {
                    count++;
                }
            }
            return count;
        }
        public static void fourCorners(String[][] array){
            int rows = array.length; 
            int columns = array[0].length;
    
            System.out.println(array[0][0]); 
            System.out.println(array[0][columns - 1]); 
            System.out.println(array[rows - 1][0]); 
            System.out.println(array[rows - 1][columns - 1]); 
        }
}
