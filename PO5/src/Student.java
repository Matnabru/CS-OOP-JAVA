import java.io.Serializable;

public class Student extends Index implements Serializable {

    protected String name;
    protected String surname;

    public Student(){

    }
    public Student(String name, String surname,int math,int english, int german, int programming, int databases)
    {
        this.name = name;
        this.surname = surname;
        this.math = math;
        this.english = english;
        this.german = german;
        this.programming = programming;
        this.databases = databases;
    }

    public void fill() {
        inputName();
        inputSurname();
        inputIndex();
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
