import java.util.Vector;

public class Budget {
    private Vector<Payment> payments;
    Budget() {
    payments = new Vector<Payment>();
    }
    public void addPayment(Payment payment){
        payments.add(payment);
    }
    public void setRealPayment(String date, String category,int realAmount){
        Payment payment;
        for(int i=0;i<payments.size();i++){
           payment = payments.get(i);
           if(date.equals(payment.get_date()) && category == payment.get_category()){
               payment.set_realAmount(realAmount);
               payments.set(i,payment);
           }
        }
    }
    public void printBudget(){
        for(int i=0;i<payments.size();i++){
            System.out.println(payments.get(i).toString());
        }
    }
    public void printPaymentsByDate(String date){
        Payment payment;
        for(int i=0;i<payments.size();i++){
            payment = payments.get(i);
            if(date.equals(payment.get_date())){
                System.out.println(payment.toString());
            }
        }
    }
    public void sumByMonth(String month, String year){
        int real=0;
        int predicted=0;

        Payment payment;
        for(int i=0;i<payments.size();i++){
            payment = payments.get(i);
            if(month.equals(payment.getMonth()) && year.equals(payment.getYear())){
                real += payment.get_realAmount();
                predicted += payment.get_predictiveAmount();
            }
        }
        System.out.println("\n\nReal sum : " + real);
        System.out.println("Predicted sum : " + predicted);
    }

}
