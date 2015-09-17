package answer3;

/**
 * Created by len on 9/16/2015.
 */
public class NumberPrint {

    public void print(int lastNumber) {
        for(int i = 1; i <= lastNumber; i++) {
            if(isDivisibleByThree(i) && isDivisibleByFive(i)) {
                System.out.print("tacocat ");
            }
            else if(isDivisibleByThree(i)) {
                System.out.print("taco ");
            }
            else if(isDivisibleByFive(i)) {
                System.out.print("cat ");
            }
            else {
                System.out.print(i + " ");
            }
        }
    }

    private boolean isDivisibleByFive(int i) {
        return i%5 ==0;
    }

    private boolean isDivisibleByThree(int i) {
        return i%3 == 0;
    }

    public static void main(String[] args) {
        NumberPrint numberPrint = new NumberPrint();
        numberPrint.print(15);
    }
}
