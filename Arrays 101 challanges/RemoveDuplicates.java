import java.util.ArrayList;

public class RemoveDuplicates {

    public int removeDuplicates(int[] intArray) {
        int flagVal = Integer.MIN_VALUE;

        if (intArray.length == 0) {
            return 0;
        }

        if (intArray.length == 1) {
            return 1;
        }

        for (int current = 0; current < intArray.length - 1; current++) {

            if (intArray[current] == flagVal) {
                continue;
            }

            for (int innerCurr = current + 1; innerCurr < intArray.length; innerCurr++) {

                if (current == innerCurr) {
                    continue;
                }

                if (intArray[innerCurr] == intArray[current]) {
                    intArray[innerCurr] = flagVal;
                }
            }
        }

        for (int start = 0; start < intArray.length; start++) {

            if (intArray[start] == flagVal) {

                int move = start + 1;

                while (move < intArray.length && intArray[move] == flagVal) {
                    move++;
                }

                if (move >= intArray.length) {
                    return start;
                }

                intArray[start] = intArray[move];
                intArray[move] = flagVal;
            }
        }
        return 0;
    }

}