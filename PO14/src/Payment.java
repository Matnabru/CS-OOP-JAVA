import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Payment {
    private Date _date;
    private String _category;
    private int _predictiveAmount;
    private boolean isReal;
    private int _realAmount;
    private SimpleDateFormat dateFormat;

    Payment(String date, String category, int amount){
        dateFormat = new SimpleDateFormat("dd/MM/yyyy");

        // Set date
        try {
            _date = dateFormat.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Set category
        _category = category;

        // Set amount you predict to pay or recive
        _predictiveAmount = amount;

        // Set isReal to false (because we didn`t set real income or expense)
        isReal = false;
        _realAmount = 0;
    }
    Payment(String date, String category, int amount, int realAmount){
        // Set date
        try {
            _date = new SimpleDateFormat("dd/MM/yyyy").parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        // Set category
        _category = category;

        // Set amount you predict to pay or recive
        _predictiveAmount = amount;

        // Set real amount
        set_realAmount(realAmount);
    }

    public void set_realAmount(int _realAmount) {
        isReal = true;
        this._realAmount = _realAmount;
    }

    @Override
    public String toString() {
        return "Payment :" +
                "\nDate=" + dateFormat.format(_date) +
                ",\nCategory='" + _category + '\'' +
                ",\nPredicted=" + _predictiveAmount +
                ",\nReal=" + _realAmount;
    }

    public String get_date() {
        return dateFormat.format(_date);
    }
    public String getYear(){
        String year = dateFormat.format(_date);
        return year.substring(6,10);
    }
    public String getMonth(){
        String year = dateFormat.format(_date);
        return  year.substring(3,5);
    }
    public String get_category() {
        return _category;
    }

    public int get_predictiveAmount() {
        return _predictiveAmount;
    }

    public int get_realAmount() {
        return _realAmount;
    }
}
