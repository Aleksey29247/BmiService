public class Main {
    public static void main(String[] args) {
        int height = 172;
        int weight = 74;
        BmiService bodyMassIndex = new BmiService();
        double bmi = bodyMassIndex.calculate(weight, height);
        if (bmi > 0) {
            System.out.printf(" Индекс массы тела  %.2f кг/м²\n", bmi);
        } else {
            System.out.printf(" Не правельно указаны данные\n");
        }
    }
}
