package answer2;

/**
 * Created by len on 9/16/2015.
 */
public class MultiplicationTable {

    public void printMultiplicationTable(int size) {
        for(int i = 1; i <= size; i++) {
            for(int j = 1; j <= size; j++) {
                System.out.print(i*j + "\t");
            }

            //Print new line
            System.out.println("");
        }
    }

    public static void main(String args[]) {
        MultiplicationTable multiplicationTable = new MultiplicationTable();
        multiplicationTable.printMultiplicationTable(12);
    }
}
