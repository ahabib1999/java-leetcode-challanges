public class ReverseString {

    public void reverseString(char[] charArr) {

        int start = 0;
        int end = charArr.length - 1;

        recursiveReverse(charArr, start, end);
    }

    private void recursiveReverse(char[] charArr, int start, int end) {
        // Base Case -> Exit out of recursion
        if (charArr == null || start == end) {
            return;
        }

        // Action -> Make changes / calculation / process data in current stack
        char temp = charArr[end];
        charArr[end] = charArr[start];
        charArr[start] = temp;

        // Recursive Step -> Now make recursive call with updated params
        recursiveReverse(charArr, start + 1, end - 1);
    }
}