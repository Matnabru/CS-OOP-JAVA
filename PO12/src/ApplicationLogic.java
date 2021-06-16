public class ApplicationLogic {
    public int numbersSum;

    public ApplicationLogic(){
        numbersSum = 0;
    }
    public void addNumber(int number){
        setNumbersSum(getNumbersSum()+number);
    }
    public void clearNumber(){
        numbersSum =0;
    }

    public void setNumbersSum(int numbersSum) {
        this.numbersSum = numbersSum;
    }

    public int getNumbersSum() {
        return numbersSum;
    }
}
