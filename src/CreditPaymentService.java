public class CreditPaymentService {

    public double calculate(int k, double p, int m) {
        double result = k*((p/(100 *12))/(1-(1/Math.pow((1+(p/(100 * 12))),m))));
        return result;

    }
}
