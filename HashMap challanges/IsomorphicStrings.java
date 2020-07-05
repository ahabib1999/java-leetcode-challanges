import java.util.HashMap;
import java.util.HashSet;

public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        HashMap<Character, Character> stringHashmap = new HashMap<>();
        HashSet<Character> charSet = new HashSet<>();

        if (s.equals(t)) {
            return true;
        }

        for (int i = 0; i < s.length(); i++) {
            char sCurrentChar = s.charAt(i);
            char tCurrentChar = t.charAt(i);

            if (stringHashmap.containsKey(sCurrentChar)) {
                char mappedValue = stringHashmap.get(sCurrentChar);

                if (mappedValue != tCurrentChar) {
                    return false;
                }
            }

            else if (charSet.contains(tCurrentChar)) {
                return false;
            }

            else {
                stringHashmap.put(sCurrentChar, tCurrentChar);
                charSet.add(tCurrentChar);
            }
        }
        return true;
    }
}