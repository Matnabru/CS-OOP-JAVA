import java.util.ArrayList;
import java.util.List;

public class Bookcase {
    private List<Shelf> shelfList;

    public Bookcase(){
        shelfList = new ArrayList<Shelf>();
    }
    public void addShelf(Shelf shelf){
        shelfList.add(shelf);
    }
    public void printPower(boolean power){
        for(int i=0;i<shelfList.size();i++){
            System.out.println("Shelf " + i);
            shelfList.get(i).printPower(power);
        }
    }
    public void printPower(){
        for(int i=0;i<shelfList.size();i++){
            System.out.println("Shelf " + i);
            shelfList.get(i).printPower();
        }
    }
}
