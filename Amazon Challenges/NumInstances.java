public class NumInstances {

    public int finalInstances(int instances, int[] averageUtil) {
        double limit = 2 * Math.pow(10, 8);
        System.out.println(limit);

        for (int i = 0; i < averageUtil.length; i++) {

            if (averageUtil[i] < 25 && instances > 1) {
                double val = instances;
                double instanceVal = val / 2;
                instances = (int) Math.round(instanceVal);
                i = i + 10;
            }

            else if (averageUtil[i] > 60 && (2 * instances) <= limit) {
                instances = instances * 2;
                i = i + 10;
            }
        }
        return instances;
    }
}
