public class MergeSortedArrays {

    public void mergeArrays(int[] numArr1, int sizeArr1, int[] numArr2, int sizeArr2) {

        for (int i = 0; i < sizeArr2; i++) {
            numArr1[sizeArr1] = numArr2[i];
            sizeArr1++;
        }

        numArr1 = sort(numArr1, 0, numArr1.length);

        for (int i = 0; i < numArr1.length; i++) {
            System.out.println(i + " : " + numArr1[i]);
        }
    }

    public int[] sort(int[] numArr1, int start, int end) {

        if (end - start < 2) {
            return numArr1;
        }

        int pivotIndex = partition(numArr1, start, end);
        sort(numArr1, start, pivotIndex);
        sort(numArr1, pivotIndex + 1, end);

        return numArr1;
    }

    public int partition(int[] numArr1, int start, int end) {

        int pivot = numArr1[start];
        int i = start;
        int j = end;

        while (i < j) {

            while (i < j && numArr1[--j] >= pivot)
                ;
            if (i < j) {
                numArr1[i] = numArr1[j];
            }

            while (i < j && numArr1[++i] <= pivot)
                ;
            if (i < j) {
                numArr1[j] = numArr1[i];
            }
        }

        numArr1[j] = pivot;
        return j;
    }
}