public class main {
    public static void main(String[] args) {

        int s = Calculator.sum(10, 20);
        System.out.println(s);

        int h = Calculator.hieu(10, 20);
        System.out.println(h);

        int c = Calculator.chia(10, 20);
        System.out.println(c);

        int n = Calculator.nhan(10, 20);
        System.out.println(n);

        double canNang = 70;
        double chieuCao = 1.72;

        double bmi = bmiCalcu(chieuCao, canNang);
        System.out.printf("\nket qua BMI cua ban la: %.1f ", bmi);

        double chisoBmi = bmiCalculator.bmiCalcu2(1.72, 70);
        System.out.printf("\nKet qua BMI cua ban la: %.2f" ,chisoBmi);


    }

    public static double bmiCalcu(double height, double weight){
        return weight/(height*height);
    }
}
