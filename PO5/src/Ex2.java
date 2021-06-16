import java.io.*;

public class Ex2 {

    public static void printdata(Student object1)
    {

        System.out.println("name = " + object1.name);
        System.out.println("surname = " + object1.surname);
        System.out.println("programming = " + object1.programming);
        System.out.println("math = " + object1.math);
        System.out.println("english = " + object1.english);
        System.out.println("german = " + object1.german);
        System.out.println("databases = " + object1.databases);
    }
    public void setup(){

        Student[] students = new Student[10];
        for(int i=0;i<10;i++){
            students[i] = new Student("Matt", "Urbanek",3,3,3,3,3);
        }
        //Student student = new Student("Matt","Urbanek",3);
        //student.fill();

        String filename = "Students.txt";

        //Serializable
        try {
            //Saving object into a file
            FileOutputStream fileOutputStream = new FileOutputStream(filename);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

            //Serialization of an object
            objectOutputStream.writeObject(students);

            //Closing streams
            objectOutputStream.close();
            fileOutputStream.close();

            System.out.println("Object has been serialized\n"
                    + "Data before Deserialization.");
            printdata(students[0]);
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
            System.err.println(ex.getMessage());
        }

        students = null;

        // Deserialization
        try {

            // Reading the object from a file
            FileInputStream file = new FileInputStream
                    (filename);
            ObjectInputStream in = new ObjectInputStream
                    (file);

            // Method for deserialization of object
            students = (Student[]) in.readObject();

            in.close();
            file.close();
            System.out.println("Object has been deserialized\n"
                    + "Data after Deserialization.");
            printdata(students[0]);

            // System.out.println("z = " + object1.z);
        }
        catch (IOException ex) {
            System.out.println("IOException is caught");
        }
        catch (ClassNotFoundException ex) {
            System.out.println("ClassNotFoundException" +
                    " is caught");
        }
    }
}
