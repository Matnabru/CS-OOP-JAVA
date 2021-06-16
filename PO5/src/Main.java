import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        exercise1();
        //exercise2();
        //exercise3();
    }
    public static void exercise1() throws IOException {
        Ex1 ex1 = new Ex1();
        ex1.setup();
        ex1.saveIntoFile();

    }
    public static void exercise2() {
        Ex2 ex2 = new Ex2();
        ex2.setup();
    }
    public static void exercise3(){
        Ex3 ex3 = new Ex3();
        ex3.saveIntoFile();
    }
}
