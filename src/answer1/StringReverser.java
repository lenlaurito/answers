package answer1;

/**
 * Created by len on 9/16/2015.
 */
public class StringReverser {

    public String reverse(String s) {
        char[] charArray =  s.toCharArray();
        int length = charArray.length;

        for(int i = 0; i < length/2; i++) {
            char temp = charArray[i];
            charArray[i] = (charArray[length - i - 1]);
            charArray[length - i - 1] = temp;
        }

        return new String(charArray);
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        String str = "Hi There!";

        System.out.println("String: " + str);
        System.out.println("Reverse String: " + reverser.reverse(str));
    }
}
