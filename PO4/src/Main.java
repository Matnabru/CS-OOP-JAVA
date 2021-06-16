import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        //zad1();

        zad2();

        //zad3();

        //zad4();

        //zad5();

    }
    public static void zad1(){
        Person person = new Person();
        person.getPerson();
    }
    public static void zad2(){
        Stack stack = new Stack(2);
        try {
            stack.push(10);
            stack.push(11);
            // Full stack exception
            //stack.push(12);
            stack.print();

            stack.pop();
            stack.pop();
            // Empty stack exception
            //stack.pop();
            stack.print();
        } catch (StackOutOfBoundsException e) {
            e.printStackTrace();
        }
        stack.print();

    }
    public static void zad3(){
    Polynomial polynomial1 = new Polynomial(4);
    polynomial1.fill();
    polynomial1.show();

    System.out.println("Define argument of your function to solve it value!");
    polynomial1.solve(scanner.nextInt());


    Polynomial polynomial2 = new Polynomial(3);
    polynomial2.fill();
    polynomial2.show();

    // Remove operator to see one of the options on defined sample
        System.out.println("Calculating...");
    //polynomial1 = polynomial1.add(polynomial2);

    //polynomial1 = polynomial1.sub(polynomial2);

    //polynomial1 = polynomial1.mul(polynomial2);

    polynomial1.show();
    }
    public static void zad4(){
        RandomTable randomTable = new RandomTable(scanner.nextInt());
        randomTable.fill();
        randomTable.show();

        RandomTable randomTable1 = new RandomTable(scanner.nextInt());
        randomTable1.fill();
        randomTable1.show();

        //randomTable.abundance(randomTable1);
        randomTable.optimizedAbundance(randomTable1);
    }
    public static void zad5(){

        Date[] dates = new Date[5];
        for(int i=0;i<5;i++){
            dates[i] = new Date(scanner.next());
            dates[i].showDate();
        }
        dates = dates[0].sort(dates);
        System.out.println("Sorted!");
        // Printing sorted array
        for(int i=0;i<5;i++){
            dates[i].showDate();
        }
    }
}
