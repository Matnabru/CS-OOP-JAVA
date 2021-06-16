public class Date {
    private int year,month,day;
    public Date(String form){
        String date = "";
        int number;
        if(form.length()!=10){
            throw new IllegalArgumentException("Invalid string length!");
        }

        // Set day
        date = "" + form.charAt(0) + form.charAt(1);
        number = Integer.parseInt(date);
        setDay(number);
        // Set month
        date = "" + form.charAt(3) + form.charAt(4);
        number = Integer.parseInt(date);
        setMonth(number);
        // Set year
        date = "" + form.charAt(6) + form.charAt(7) + form.charAt(8) + form.charAt(9);
        number = Integer.parseInt(date);
        if(number == 2013){
            throw new IllegalArgumentException("2013 year is cursed and can`t be accepted!");
        }
        setYear(number);
    }
    public void showDate(){
        System.out.print(" D:" + getDay());
        System.out.print(" M:" + getMonth());
        System.out.print(" Y:" + getYear() + "\n");
    }
    public void setDay(int day) {
        this.day = day;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }
    public Date[] sort(Date[] dates){
        // Temporary date for swapping
        Date temp = dates[0];
        for(int i=0;i<dates.length-1;i++){
            for(int j=0;j<dates.length-1-i;j++){
                if(dates[j].getYear() > dates[j+1].getYear()){
                    temp = dates[j];
                    dates[j] = dates[j+1];
                    dates[j+1] = dates[j];
                }else if(dates[j].getYear() == dates[j+1].getYear()){
                    // If two dates have the same year check their month
                    if(dates[j].getMonth() > dates[j+1].getMonth()){
                        temp = dates[j];
                        dates[j] = dates[j+1];
                        dates[j+1] = dates[j];
                    }else if(dates[j].getMonth() == dates[j+1].getMonth()){
                        // If two dates have the same month and year check their day
                        if(dates[j].getDay() > dates[j+1].getDay()){
                            temp = dates[j];
                            dates[j] = dates[j+1];
                            dates[j+1] = dates[j];
                        }
                    }
                }
            }
        }
        return dates;
    }
}
