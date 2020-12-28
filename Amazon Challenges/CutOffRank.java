import java.util.*;
import java.io.*;
import java.lang.*;

public class CutOffRank {

    public int cutOffRank(int cutOffRank, int num, int[] scores) {
        int maxScore = -1;
        int playerRank = 1;
        int[] rankArr = new int[num];
        int recursionFlag = num;
        int count = 0;

        rankArr = getRankArr(scores, num, maxScore, playerRank, rankArr, recursionFlag);

        for (int i = 0; i < num; i++) {
            if (rankArr[i] <= cutOffRank) {
                count += 1;
            }
        }
        return count;
    }

    private int[] getRankArr(int[] scores, int num, int maxScore, int playerRank, int[] rankArr, int recursionFlag) {

        if (recursionFlag <= 0) {
            return rankArr;
        }

        int scoreTies = 0;
        int maxScoreIdx = -1;

        for (int i = 0; i < num; i++) {

            if (scores[i] == 0) {
                continue;
            }

            if (scores[i] > maxScore) {
                maxScore = scores[i];
                maxScoreIdx = i;
            }
        }

        for (int i = 0; i < num; i++) {
            if (scores[i] == maxScore) {

                if (!(i == maxScoreIdx)) {
                    scoreTies += 1;
                }

                rankArr[i] = playerRank;
                scores[i] = -1;
            }
        }
        recursionFlag = recursionFlag - 1;

        return getRankArr(scores, num, -1, playerRank + 1 + scoreTies, rankArr, recursionFlag);
    }
}
