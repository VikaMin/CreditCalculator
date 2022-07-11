public class CreditPaymentService {

    public double calculate(int credit, double precent, int mouth) {
        double result = credit * ((precent / (100 * 12)) / (1 - (1 / Math.pow((1 + (precent / (100 * 12))), mouth))));
        return result;
    }
}
