import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GraphicCalculator implements Runnable {

    private JFrame frame;
    private JTextField outputField;
    private JTextField inputField;
    private JButton plus;
    private JButton minus;
    private JButton z;

    @Override
    public void run() {
        frame = new JFrame("Calculator");
        frame.setPreferredSize(new Dimension(300, 150));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void createComponents(Container container) {
        fillMemberVariables();

        container.setLayout(new GridLayout(3,1));
        container.add(outputField);
        container.add(inputField);

        JPanel lowerPanel = new JPanel();
        lowerPanel.setLayout(new GridLayout(1,3));
        lowerPanel.add(plus);
        lowerPanel.add(minus);
        lowerPanel.add(z);
        container.add(lowerPanel);
    }

    public void fillMemberVariables() {
        outputField = new JTextField("0");
        outputField.setEnabled(false);
        inputField  = new JTextField();
        plus        = new JButton("+");
        minus       = new JButton("-");
        z           = new JButton("Z");
        z.setEnabled(false);

        ButtonListener listener = new ButtonListener(plus, minus, z, inputField, outputField);
        plus.addActionListener(listener);
        minus.addActionListener(listener);
        z.addActionListener(listener);
    }
}
