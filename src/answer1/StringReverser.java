package answer1;

/**
 * Created by len on 9/16/2015.
 */
public class StringReverser {

    public String reverse(String s) {
        StringBuffer reversedString = new StringBuffer();
        int length = s.length();

        for(int i = 0; i < length; i++) {
            reversedString = reversedString.append(s.charAt(length - i - 1));
        }

        return reversedString.toString();
    }

    public static void main(String[] args) {
        StringReverser reverser = new StringReverser();
        String str = "Hi There!";

        System.out.println("String: " + str);
        System.out.println("Reverse String: " + reverser.reverse(str));


    }
}
