import java.util.ArrayList;
import java.util.List;

public class Central {
    private List<Bookcase> bookcaseList;

    public Central(){
        bookcaseList = new ArrayList<>();
    }

    public void addBookcase(Bookcase bookcase){
        bookcaseList.add(bookcase);
    }
    public void printPower(boolean power){
        for(int i=0;i<bookcaseList.size();i++){
            System.out.println("Shelf " + i);
            bookcaseList.get(i).printPower(power);
        }
    }
    public void printPower(){
        for(int i=0;i<bookcaseList.size();i++){
            System.out.println("Shelf " + i);
            bookcaseList.get(i).printPower();
        }
    }
}
