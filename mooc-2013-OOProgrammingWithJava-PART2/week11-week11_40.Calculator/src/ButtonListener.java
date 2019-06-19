import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTextField;

public class ButtonListener implements ActionListener {

    private JButton     plusButton;
    private JButton     minusButton;
    private JButton     zButton;
    private JTextField  inputField;
    private JTextField  outputField;
    private ApplicationLogic calculator;

    public ButtonListener(JButton plusButton, JButton minusButton, JButton zButton, JTextField inputField, JTextField outputField) {
        this.plusButton     = plusButton;
        this.minusButton    = minusButton;
        this.zButton        = zButton;
        this.inputField     = inputField;
        this.outputField    = outputField;
        this.calculator     = new ApplicationLogic();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int input = 0;
        try {
            input = Integer.parseInt(inputField.getText());
        } catch (Exception ex) {
        }

        if (e.getSource() == plusButton) {
            calculator.plus(input);
        } else if (e.getSource() == minusButton) {
            calculator.minus(input);
        } else {
            calculator.reset();
        }

        outputField.setText("" + calculator.result());
        inputField.setText("");
        setZButton();
    }

    public void setZButton() {
        if (calculator.result() == 0) {
            zButton.setEnabled(false);
        } else {
            zButton.setEnabled(true);
        }
    }
}
