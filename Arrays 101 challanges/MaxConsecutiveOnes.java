public class MaxConsecutiveOnes {

    public int countOnes(int[] intArr) {
        int count = 0;
        int max = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == 1) {
                count += 1;

                if (count > max) {
                    max = count;
                }
            }

            else {
                count = 0;
            }
        }

        return max;
    }
}