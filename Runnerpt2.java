public class Runnerpt2 {
    public static void main(String[] args) {
        // TEST CODE FOR totalElements
int[][] testArr1 = {{5, 2}, {1, 3}, {7, 9}};
System.out.println(FunWith2DArrays.totalElements(testArr1));
int[][] testArr2 = {{1, 2, 3}, {6, 5, 4}};
System.out.println(FunWith2DArrays.totalElements(testArr2));
int[][] testArr3 = {{1, 2, 3, 4}, {7, 8, 9, 10}};
System.out.println(FunWith2DArrays.totalElements(testArr3));
int[][] testArr4 = {{4, 5, 2}, {1, 9, 7}, {8, 10, 13}};
System.out.println(FunWith2DArrays.totalElements(testArr4));
int[][] testArr5 = {{4, 5, 2, 4, 1}, {1, 9, 7, 8, 2}, {8, 10, 13, 4, 3}};
System.out.println(FunWith2DArrays.totalElements(testArr5));
int[][] testArr6 = {{4, 5, 2, 4, 8, 9, 10}, {1, 9, 7, 8, 6, 1, 2}};
System.out.println(FunWith2DArrays.totalElements(testArr6));
int[][] testArr7 = {{4}, {7}, {8}, {2}};
System.out.println(FunWith2DArrays.totalElements(testArr7));
int[][] testArr8 = {{4}};
System.out.println(FunWith2DArrays.totalElements(testArr8));
int[][] testArr9 = {{}};
System.out.println(FunWith2DArrays.totalElements(testArr9));

    }
}
