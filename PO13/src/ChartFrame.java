import javax.swing.*;
import java.util.Vector;

public class ChartFrame extends JFrame {
    private  Vector<Integer> x;
    private Vector<Integer> y;


    private ChartPanel mainPanel;

    ChartFrame(Vector<Integer> x, Vector<Integer> y){
        this.x = x;
        this.y = y;

        mainPanel = new ChartPanel(600,600,x,y);


        this.add(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
}
