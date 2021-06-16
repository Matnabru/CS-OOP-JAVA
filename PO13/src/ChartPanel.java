import javax.swing.*;
import java.awt.*;
import java.util.Vector;

public class ChartPanel extends JPanel {
    private Vector<Integer> x;
    private Vector<Integer> y;
    private double scaleX;
    private double scaleY;
    ChartPanel(int width,int height,Vector<Integer> x, Vector<Integer> y){
        this.x = x;
        this.y = y;

        // Defining size
        this.setPreferredSize(new Dimension(width,height));

    }

    public void paint(Graphics g){
        Graphics2D graphics2D = (Graphics2D) g;
        // Creating X and Y AXIS
        graphics2D.drawLine(50,550,550,550);
        graphics2D.drawLine(50,50,50,550);
        graphics2D.drawString("X",540,565);
        graphics2D.drawString("Y",40,65);

        // Calculating scale for further drawing
        calculateScale();

        for(int i=1;i<x.size();i++){
            graphics2D.drawLine(50+(int)(x.get(i-1)*scaleX),550-(int)(y.get(i-1)*scaleY),50+(int)(x.get(i)*scaleX),550-(int)(y.get(i)*scaleY));
        }
    }
    public void calculateScale(){
        int maxX=Integer.MIN_VALUE;
        int maxY=Integer.MIN_VALUE;
        // Calculating maximum X and Y for scale
        for(int i=0;i<x.size();i++){
            if(x.get(i)>maxX){
                maxX = x.get(i);
            }
            if(y.get(i)>maxY){
                maxY = y.get(i);
            }
        }
        System.out.println("Max X : " + maxX);
        System.out.println("Max Y : " + maxY);
        scaleX = 500.0/maxX;
        System.out.println("X scale :" + scaleX);
        scaleY = 500.0/maxY;
        System.out.println("Y scale :" + scaleY);
    }
}
