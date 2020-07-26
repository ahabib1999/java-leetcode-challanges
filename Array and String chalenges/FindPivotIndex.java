public class FindPivotIndex {

    public int getPivotIndex(int[] intArr) {

        int totalSum = 0;
        int leftSum = 0;

        for (int i = 0; i < intArr.length; i++) {
            totalSum += intArr[i];
        }

        for (int i = 0; i < intArr.length; i++) {
            if (leftSum == totalSum - leftSum - intArr[i]) {
                return i;
            }

            leftSum += intArr[i];
        }

        return -1;
    }
}