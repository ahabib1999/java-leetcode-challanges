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
        // System.out.println(needleIdx);

        dataTypeConversions challenge3 = new dataTypeConversions();

        // challenge3.conversions();

        rotateimage challenge4 = new rotateimage();
        int[][] matrix = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };

        // challenge4.rotate(matrix);

        CapLetter challenge5 = new CapLetter();
        String line = "hello world";

        challenge5.capitalize(line);
    }
}