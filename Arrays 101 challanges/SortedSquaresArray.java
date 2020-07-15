public class SortedSquaresArray {

    public void sortSquares(int[] intArr) {

        int[] resultArr = new int[intArr.length];
        int left = 0;
        int right = intArr.length - 1;
        int insertIndex = intArr.length - 1;

        while (right >= left) {
            int rightSquared = (intArr[right] * intArr[right]);
            int leftSquared = (intArr[left] * intArr[left]);

            if (right == left) {
                resultArr[insertIndex] = rightSquared;
                break;
            }

            if (rightSquared > leftSquared) {
                resultArr[insertIndex] = rightSquared;
                right--;
            }

            else if (leftSquared > rightSquared) {
                resultArr[insertIndex] = leftSquared;
                left++;
            }

            else {
                resultArr[insertIndex] = rightSquared;
                right--;
            }

            insertIndex--;
        }

        for (int i = 0; i < resultArr.length; i++) {
            System.out.println(resultArr[i]);
        }
    }
}