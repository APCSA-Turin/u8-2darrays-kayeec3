public class Runner {
    public static void main(String[] args) {
        String[][] seatingChart = {
        {"Abby", "Don", "George", "Kim"}, 
        {"Brian", "Elenor", "Harry", "Lenny"}, 
        {"Cathy", "Fred", "Jill", "Matt"}
        };
        seatingChart[1][2] = "Paul";
        String temp = seatingChart[0][0];
        seatingChart[0][0] = seatingChart[2][3];
        seatingChart[2][3] = temp;
        String[] temp1 = seatingChart[0];
        seatingChart[0] = seatingChart[1];
        seatingChart[1] = temp1;
        for (String[] k : seatingChart) {
            for (String l : k ) {
                System.out.print(l + " ");
            }
            System.out.println();
        }
        System.out.println(seatingChart[0][2] + seatingChart[2][0]);
        

        }
    
}