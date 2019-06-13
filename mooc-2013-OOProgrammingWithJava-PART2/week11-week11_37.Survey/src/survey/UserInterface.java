package survey;

import java.awt.Container;
import java.awt.Dimension;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(400, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    public JFrame getFrame() {
        return frame;
    }

    private void createComponents(Container container) {
        JLabel text = new JLabel("Are you?");
        container.add(text);
        JCheckBox boxYES = new JCheckBox("Yes!");
        JCheckBox boxNO = new JCheckBox("No!");
        container.add(boxYES);
        container.add(boxNO);
        BoxLayout layout = new BoxLayout(container, BoxLayout.Y_AXIS);
        container.setLayout(layout);

        container.add(new JLabel("Why?"));
        JRadioButton noReason = new JRadioButton("No reason.");
        JRadioButton cuzFun = new JRadioButton("Because it is fun!");

        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(noReason);
        buttonGroup.add(cuzFun);

        container.add(noReason);
        container.add(cuzFun);

        JButton button = new JButton("Done!");
        container.add(button);
    }
}
