public class BmiService {

    public BmiService() {
    }

    public static double calculate(int m, int h) {
        if ((m <= 0) || (h <= 0)) {
            return -1;
        }

        return m / Math.pow((double) (h) / 100, 2);
    }

}
