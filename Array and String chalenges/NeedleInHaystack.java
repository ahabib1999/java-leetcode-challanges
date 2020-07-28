import javax.xml.stream.events.NotationDeclaration;

public class NeedleInHaystack {

    public int findNeedle(String haystack, String needle) {

        if (needle.length() == 0) {
            return 0;
        }

        if (haystack.length() == 0 || needle.length() > haystack.length()) {
            return -1;
        }

        int needleIdx = haystack.indexOf(needle);
        return needleIdx;
    }
}