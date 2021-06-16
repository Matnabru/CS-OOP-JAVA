import java.io.FileWriter;
import java.io.IOException;


public class Ex3 {

    public static String wyznaczLiczbyPierwsze(int minZakres ,int maxZakres) {
        StringBuilder wynik = new StringBuilder();

        for (int i = minZakres; i <= maxZakres; i++) {
            int licznik = 0;
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    licznik = licznik + 1;
                }
            }
            if (licznik == 2) {
                wynik.append(i).append("\n");
            }
        }
        return wynik.toString();
    }
    public void saveIntoFile(){
        try {
            FileWriter myWriter = new FileWriter("filename3.txt");
            myWriter.write(wyznaczLiczbyPierwsze(1000,10000));
            myWriter.close();
        }catch (IOException e){
            System.out.println("An error occurred");
        }
    }
}
