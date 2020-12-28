public class Main {

    public static void main(String[] args) {
        /*
         * CutOffRank challenge1 = new CutOffRank(); int[] scores = { 2, 2, 3, 4, 5 };
         * 
         * int count = challenge1.cutOffRank(4, 5, scores);
         */

        // System.out.println(count);

        /*
         * NumInstances challenge2 = new NumInstances(); int[] averageUtil = { 30, 95,
         * 4, 8, 19, 89 }; int instances = challenge2.finalInstances(100000000,
         * averageUtil); System.out.println(instances);
         */

        WinningSequence challenge3 = new WinningSequence();

        int[] sequence = challenge3.winningSequence(6, 3, 7);

        if (sequence == null) {
            System.out.println("-1");
        }

        else {
            for (int i = 0; i < 6; i++) {
                System.out.println(sequence[i]);
            }
        }
    }
}
