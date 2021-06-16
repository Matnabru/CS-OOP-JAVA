public class Main {
    public static void main(String args[]){
        Budget budget = new Budget();
        budget.printBudget();

        Payment payment = new Payment("21/03/2020","Test",600);
        budget.addPayment(payment);
        budget.printBudget();

        // User can add real payment to existing predicted payment
        budget.setRealPayment("21/03/2020","Test",700);
        budget.printBudget();

        System.out.println("\nPRINTED BY DATE : ");
        budget.printPaymentsByDate("21/03/2020");

        Payment payment1 = new Payment("21/03/2020","Groceries",-300);
        budget.addPayment(payment1);
        Payment payment2 = new Payment("21/05/2020","TV",-30);
        budget.addPayment(payment2);
        System.out.println("\nPRINTED BY DATE vol2 : ");
        budget.printPaymentsByDate("21/03/2020");

        /* March :      Pred.   Real
            Test        600     700
            Groceries   -300    0
            Sum :       300     700
        */
        budget.sumByMonth("03","2020");
    }
}
