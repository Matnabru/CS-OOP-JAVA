import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

public class Ex1 {
    final int MAXVALUE = 1000000000;
    final int MINVALUE = 1;

    private int n,m;
    private int[] tableN;
    private int[] tableM;
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

    public Ex1() {
        //Empty constructor (at least for now)
    }
    public void setup() throws IOException {
        inputN();
        inputM();
        initializeTable();
    }
    private void inputN() throws IOException {
        System.out.println("Enter n");
        String name=br.readLine();
        try {
            this.n = Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            System.out.println("Error : Wrong input");
            inputN();
        }
    }
    private void inputM() throws IOException {
        System.out.println("Enter m");
        String name = null;
        name=br.readLine();
        try {
            this.m = Integer.parseInt(name);
        }
        catch (NumberFormatException e){
            System.out.println("Error : Wrong input");
            inputN();
        }
    }
    public void initializeTable(){
        tableN = new int[n];
        tableM = new int[m];
        for(int i=0;i<n;i++){
            tableN[i] = getRandomNumber(MINVALUE,MAXVALUE);
        }
        for(int j=0;j<m;j++){
            tableM[j] = getRandomNumber(MINVALUE,MAXVALUE);
        }
    }
    private int getRandomNumber(int min, int max) {
        return (int) ((Math.random() * (max - min+1)) + min);
    }
    public void saveIntoFile(){
        int result[] = new int[n+m];
        System.arraycopy(tableN,0,result,0,n);
        System.arraycopy(tableM,0,result,n,m);
        Arrays.sort(result);
        int length=0;
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            for(int i=0;i<result.length-1;i++){
                //System.out.print(result[i] + " ");
                length++;
                if(result[i]!=result[i+1] || i==result.length-2){
                    myWriter.write(result[i] + "-" + length + "\n");
                    length=0;
                }
            }
            myWriter.close();
        }catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}
