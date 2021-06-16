import java.util.ArrayList;
import java.util.List;

public class Shelf {
    private List<Slot> slotList;

    public Shelf(){
        slotList = new ArrayList<Slot>();
    }

    public void addSlot(Slot slot){
        slotList.add(slot);
    }
    public String printSlotType(int type){
        String line = "";
        for(int i=0;i<slotList.size();i++){
            if(slotList.get(i).getType()==type){
                line+= i + ". " + slotList.get(i).toString() + '\n';
            }
        }
        return line;
    }
    public String printPower(boolean power){
        String line = "";
        for(int i=0;i<slotList.size();i++){
            if(slotList.get(i).isPower()==power){
                line+= i + ". " + slotList.get(i).toString() + '\n';
            }
        }
        return line;
    }
    public String printPower(){
        String line = "";
        for(int i=0;i<slotList.size();i++){
                line+= i + ". " + slotList.get(i).toString() + '\n';
        }
        return line;
    }
    @Override
    public String toString() {
        String line = "";
        for(int i=0;i<slotList.size();i++){
           line += i + ". " + slotList.get(i).toString() + '\n';
        }

        return line;
    }
}
