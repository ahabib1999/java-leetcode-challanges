public class DuplicateZeros {

    public void duplicateZerosInArr(int[] intArr) {
        for (int i = 0; i < intArr.length; i++) {

            if (intArr[i] == 0) {

                for (int j = i + 1; j < intArr.length - 1; j++) {
                    int temp = intArr[j];
                    intArr[j] = intArr[i];
                    intArr[j + 1] = temp;
                }
            }
        }

        for (int j = 0; j < intArr.length; j++) {
            System.out.println(intArr[j]);
        }
    }
}