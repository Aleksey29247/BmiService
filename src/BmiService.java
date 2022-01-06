public class BmiService {
    public static double calculate(int weight, int height) {
        if ((weight <= 0) || (height <= 0)) {
            return -1;
        }
        return weight / Math.pow((double) (height) / 100, 2);
    }
}
