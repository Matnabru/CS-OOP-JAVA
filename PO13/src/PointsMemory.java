import java.util.Vector;

public class PointsMemory {
    private Vector<Integer> x;
    private  Vector<Integer> y;
    PointsMemory(){
        x = new Vector<>();
        y = new Vector<>();
    }
    public void addElement(int x,int y){
        this.x.add(x);
        this.y.add(y);
    }

    public Vector<Integer> getX() {
        return x;
    }

    public Vector<Integer> getY() {
        return y;
    }
    public void clear(){
        x = new Vector<>();
        y = new Vector<>();
    }
}
