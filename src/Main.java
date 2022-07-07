public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int credit = 1_000_000; // сумма кредита
        double percent = 9.99; // процентная ставка
        double payment;

        payment = service.calculate(credit, percent, 12);
        System.out.println();
        System.out.println("сумма кредита: " + credit + "руб.  процентная ставка: " + percent + "%  количество месяцев: " + 12);
        System.out.println("месячный платеж составляет: " + payment + "руб.");



        payment = service.calculate(credit, percent, 24);
        System.out.println();
        System.out.println("сумма кредита: " + credit + "руб.  процентная ставка: " + percent + "%  количество месяцев: " + 24);
        System.out.println("месячный платеж составляет: " + payment + "руб.");



        payment = service.calculate(credit, percent, 36);
        System.out.println();
        System.out.println("сумма кредита: " + credit + "руб.  процентная ставка: " + percent + "%  количество месяцев: " + 36);
        System.out.println("месячный платеж составляет: " + payment + "руб.");

    }
}
