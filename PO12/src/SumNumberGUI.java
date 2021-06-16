import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SumNumberGUI extends JFrame {

    private JPanel mainPanel;
    private JButton addButton;
    private JButton saveButton;
    private JTextField numberTextField;
    private JLabel sumNumbers;

    SumNumberGUI(String title){
        super(title);
        // Basic setup
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setContentPane(mainPanel);
        this.pack();

        ApplicationLogic applicationLogic = new ApplicationLogic();

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                int sum = (int) Double.parseDouble(numberTextField.getText());
                numberTextField.setText("");
                applicationLogic.addNumber(sum);
                System.out.println(applicationLogic.getNumbersSum());
            }
        });
        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                sumNumbers.setText("Sum : " + applicationLogic.getNumbersSum());
                applicationLogic.clearNumber();
            }
        });
    }

}
