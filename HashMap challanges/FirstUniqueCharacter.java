import java.util.LinkedHashMap;

public class FirstUniqueCharacter {

    public int getUniqChar(String givenString) {

        LinkedHashMap<Character, Integer> charMap = new LinkedHashMap<>();

        if (givenString.length() == 0) {
            return -1;
        }

        for (int i = 0; i < givenString.length(); i++) {

            char currentChar = givenString.charAt(i);

            if (charMap.containsKey(currentChar)) {
                int mappedValue = charMap.get(currentChar);
                mappedValue += 1;
                charMap.put(currentChar, mappedValue);
            }

            else {
                charMap.put(currentChar, 1);
            }
        }

        for (char key : charMap.keySet()) {
            int mappedValue = charMap.get(key);

            if (mappedValue == 1) {
                return givenString.indexOf(key);
            }
        }
        return -1;
    }
}