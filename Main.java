public class Main {
    public static void main(String[] args) {
        int arr1[][] = new int[2][3];
        String arr2[][] = new String[4][2];
        int count = 1;
        for (int[] l : arr1) {
            for (int k : l) {
                k = count;
                count++;
                System.out.print(k + " ");
            }
            System.err.println();
        }
        arr2[0][0] = "a";
        arr2[0][1] = "b";
        arr2[1][0] = "c";
        arr2[1][1] = "d";
        arr2[2][0] = "e";
        arr2[2][1] = "f";
        arr2[3][0] = "g";
        arr2[3][1] = "h";
        for (String[] l : arr2) {
            for (String k : l) {
                System.out.print(k + " ");
            }
            System.err.println();
        }
        System.out.println(arr1[0][2] + arr2[2][0]);

        
     }
}
