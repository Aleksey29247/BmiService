public class Main {
    public static  void main (String [] args) {
        int h=172;
        int m=74;
        BmiService cBmi=new BmiService();
        double bmi=cBmi.calculate(m,h);
        if (bmi>0)
            System.out.printf (" Индекс массы тела  %.2f кг/м²\n",bmi);
        else
            System.out.printf (" Не правельно указаны данные\n");
    }
}
