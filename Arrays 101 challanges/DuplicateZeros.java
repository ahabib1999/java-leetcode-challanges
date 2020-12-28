public class DuplicateZeros {

    public void duplicateZerosInArr(int[] intArr) {

        if (intArr.length == 0) {
            return;
        }

        int count = getNumberOfZeros(intArr);

        if (count == 0) {
            return;
        }

        int[] newArr = new int[intArr.length - count];

        newArr = getNewArr(intArr, newArr);
        intArr = duplicateZeros(intArr, newArr);

        for (int i = 0; i < intArr.length; i++) {
            System.out.println(intArr[i]);
        }
    }

    public int getNumberOfZeros(int[] intArr) {
        int count = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == 0) {

                count += 1;
            }
        }
        return count;
    }

    public int[] getNewArr(int[] intArr, int[] newArr) {

        int newArrIdx = 0;

        for (int i = 0; i < intArr.length; i++) {

            if (newArrIdx < newArr.length && intArr[i] != 0) {

                newArr[newArrIdx] = intArr[i];
                newArrIdx++;
            }
        }
        return newArr;
    }

    public int[] duplicateZeros(int[] intArr, int[] newArr) {

        int newArrIdx = 0;

        for (int i = 0; i + 2 < intArr.length; i++) {

            if (newArrIdx < newArr.length && intArr[i] == 0) {

                intArr[i + 1] = 0;
                intArr[i + 2] = newArr[newArrIdx];
                i = i + 1;
            }

            newArrIdx++;
        }
        return intArr;
    }
}