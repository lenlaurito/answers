package answer4;

/**
 * Created by len on 9/16/2015.
 */
public class DiceProbability {

    public double getProbability(int i) {
        if(i > 12 || i <= 0) {
            return 0;
        }

        int possibilities = i - 1;

        if(possibilities > 6) {
            possibilities = 6 - (possibilities - 6);
        }

        return (double)possibilities/36;
    }

    public static void main(String args[]) {
        DiceProbability diceProbability = new DiceProbability();

        for(int i = 1; i <= 12; i++) {
            System.out.println("probabilityOfResult(" + i + ") = " + diceProbability.getProbability(i));
        }

    }
}
