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
        public static double average(int[][] array) {
            double count = 0;
            int amount = 0;
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++ ) {
                    count += array[i][j];
                    amount++;
                }
            }
            return count/amount;
        }
        public static int edgeSum(int[][] array) {
            int sum = 0;
            for (int i = 0; i< array[0].length; i++) {
                sum+=array[0][i];
            }
            for (int i = 1; i< array.length-1; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (j == 0 || j == array[i].length-1) {
                        sum+=array[i][j];
                    }
                }
            }
            for (int i = 0; i < array[0].length; i++) {
                sum+=array[array.length-1][i];
            }

            return sum;
        }
        public static int[] indexFound(String[][] array, String letter) {
            int[] index = new int[2];
            for (int i = 0; i< array.length; i++) {
                for (int k = 0; k < array[i].length; k++) {
                    if (array[i][k].equals(letter)) {
                        index[0] = i;
                        index[1] = k;
                        return index;
                    }
                }
            }
            return index;
        }
        public static int[][] split(int[][] array, int index1, int index2) {
            if (index1 >= array.length || index2 >= array[0].length) {
                int[][] returnArray = new int[0][0];
                return returnArray;
            }
            int[][] split1 = new int[index1+1][index2+1];
            for (int row = 0; row <= index2; row++) {
                for (int col = 0; col <= index2; col++) {
                    split1[row][col] = array[row][col];
                }
            }
            return array;
        }
        public static int[][] invert(int[][] array) {
            int[][] inverted = new int[array[0].length][array.length];
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; i++) {
                    int num = array[i][j];
                    inverted[j][i] = num;
                }
            }
            return inverted;
        }
}
