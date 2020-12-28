public class dataTypeConversions {

    public void conversions() {

        int val = 56;
        String str = Integer.toString(val);

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            System.out.println(currentChar);
        }
    }
}