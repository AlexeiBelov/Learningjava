package example;

public class TheArithmeticMean {
    public static void main(String[] args) {
        double[] numbers = new double[]{10.2, 2.2, 3.8, 4.9};
        double sum = 0;
        for (double number : numbers) {
            System.out.println(sum += number);
        }
        System.out.println(sum / numbers.length);
    }
}
