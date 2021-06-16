import java.util.Scanner;

public class Person {

    Scanner scanner = new Scanner(System.in);
    private String name;
    private String surname;
    private int age;

    public Person(){
        System.out.println("Type your name : ");
        checkName();
        System.out.println("Type your surname : ");
        checkSurname();
        System.out.println("Type your age : ");
        checkAge();
    }
    private void checkName(){
        String name;
        name = scanner.nextLine();
        if(name.length()<3){
            throw new IllegalArgumentException("Name : " + name + " is too short. It needs to have at least 3 characters");
        }
        setName(name);
    }
    private void checkSurname(){
        String surname;
        surname = scanner.nextLine();
        if(surname.length()<3){
            throw new IllegalArgumentException("Surname : " + surname + " is too short. It needs to have at least 3 characters");
        }
        setSurname(surname);
    }
    private void checkAge(){
        int age;
        age = scanner.nextInt();
        if(age<1||age>100){
            throw new IllegalArgumentException("Invalid age : " + age);
        }
        setAge(age);
    }
    public void getPerson(){
        System.out.println("Name : " + getName());
        System.out.println("Surname : " + getSurname());
        System.out.println("Age : " + getAge());
    }


    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
