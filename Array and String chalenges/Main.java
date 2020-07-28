public class Main {

    public static void main(String[] args) {

        int[] intArr = { -1, 1, 0, 0 };

        FindPivotIndex challenge1 = new FindPivotIndex();

        int pivotIdx = challenge1.getPivotIndex(intArr);
        // System.out.println(pivotIdx);

        String haystack = "ooh";
        String needle = "hoooo";

        NeedleInHaystack challenge2 = new NeedleInHaystack();

        int needleIdx = challenge2.findNeedle(haystack, needle);
        System.out.println(needleIdx);
    }
}