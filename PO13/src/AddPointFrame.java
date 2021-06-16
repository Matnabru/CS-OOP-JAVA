import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddPointFrame extends JFrame {
    private AddPointPanel mainPanel;

    private JLabel labelX;
    private JLabel labelY;
    private JTextField jTextFieldX;
    private JTextField jTextFieldY;
    private JButton jButtonDraw;
    private JButton jButtonAdd;
    private PointsMemory pointsMemory;
    AddPointFrame(){
        pointsMemory = new PointsMemory();
        // Construct panel
        mainPanel = new AddPointPanel(300,130);


        // Functions below were made for learning purposes,
        // other option is to make universal function which takes some parameters and change one object passed as a function`s parameter
        // For example: constructLabel(JLabel label, String text, int x, int y, int width, int height)

        constructLabels();
        constructTextFields();
        constructButtons();

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.add(mainPanel);
        this.pack();
        this.setLocationRelativeTo(null);
        this.setVisible(true);
    }
    private void constructLabels(){
        labelX = new JLabel("X : ");
        labelX.setVisible(true);
        labelX.setBounds(20,0,50,50);
        this.add(labelX);

        labelY = new JLabel("Y : ");
        labelY.setVisible(true);
        labelY.setBounds(20,50,50,50);
        this.add(labelY);
    }
    private void constructTextFields(){
        jTextFieldX = new JTextField("0");
        jTextFieldX.setBounds(60,10,50,30);
        this.add(jTextFieldX);

        jTextFieldY = new JTextField("0");
        jTextFieldY.setBounds(60,60,50,30);
        this.add(jTextFieldY);
    }
    private void constructButtons(){
        jButtonAdd = new JButton();
        jButtonAdd.setText("Add");
        jButtonAdd.setBounds(190,10,90,40);
        jButtonAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                pointsMemory.addElement(Integer.parseInt(jTextFieldX.getText()),Integer.parseInt(jTextFieldY.getText()));
                jTextFieldX.setText("0");
                jTextFieldY.setText("0");
            }
        });

        this.add(jButtonAdd);
        jButtonDraw = new JButton();
        jButtonDraw.setText("Draw");
        jButtonDraw.setBounds(190,60,90,40);
        jButtonDraw.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.out.println(pointsMemory.getX());
                System.out.println(pointsMemory.getY());
                new ChartFrame(pointsMemory.getX(),pointsMemory.getY());
                pointsMemory.clear();
            }
        });
        this.add(jButtonDraw);
    }
}
