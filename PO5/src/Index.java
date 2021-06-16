import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Index {
    protected int math;
    protected int english;
    protected int programming;
    protected int databases;
    protected int german;

    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);


    protected void inputIndex(){
        inputMath();
        inputEnglish();
        inputProgramming();
        inputDatabases();
        inputGerman();
    }
    protected void inputMath(){
        System.out.println("Enter math grade : ");
        try {
            String grade=br.readLine();
            this.math = Integer.parseInt(grade);
        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputMath();
        }
    }
    protected void inputEnglish(){
        System.out.println("Enter english grade : ");
        try {
            String grade=br.readLine();
            this.english = Integer.parseInt(grade);
        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputEnglish();
        }
    }
    protected void inputProgramming(){
        System.out.println("Enter programming grade : ");
        try {
            String grade=br.readLine();
            this.programming = Integer.parseInt(grade);
        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputProgramming();
        }
    }
    protected void inputDatabases(){
        System.out.println("Enter databases grade : ");
        try {
            String grade=br.readLine();
            this.databases = Integer.parseInt(grade);
        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputDatabases();
        }
    }
    protected void inputGerman(){
        System.out.println("Enter german grade : ");
        try {
            String grade=br.readLine();
            this.german = Integer.parseInt(grade);
        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputGerman();
        }
    }
}
