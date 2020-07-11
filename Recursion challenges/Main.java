public class Main {

    public static void main(String[] args) {

        ReverseString challenge1 = new ReverseString();

        char[] charArr = { 'H', 'a', 'n', 'n', 'a', 'h' };

        challenge1.reverseString(charArr);

        for (int i = 0; i < charArr.length; i++) {
            System.out.println(charArr[i]);
        }
    }
}