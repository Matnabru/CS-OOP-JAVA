import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Serializable;

public class Student2 implements Serializable {
    InputStreamReader r=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(r);

    protected String name;
    protected String surname;

    public Student2(){

    }
    public Student2(String name, String surname)
    {
        this.name = name;
        this.surname = surname;
    }

    public void fill() {
        inputName();
        inputSurname();
    }
    private void inputName(){
        System.out.println("Enter name");
        try {
            String name=br.readLine();
            this.name = name;

        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputName();
        }
    }
    private void inputSurname(){
        System.out.println("Enter surname");
        try {
            String surname=br.readLine();
            this.surname = surname;

        }
        catch (Exception e){
            System.out.println("Error : Something went wrong...");
            inputSurname();
        }
    }
}
