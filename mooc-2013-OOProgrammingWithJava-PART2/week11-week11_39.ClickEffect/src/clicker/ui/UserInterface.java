package clicker.ui;

import clicker.applicationlogic.Calculator;

import java.awt.*;
import javax.swing.*;

public class UserInterface implements Runnable {

    private JFrame frame;
    private Calculator calc;

    public UserInterface(Calculator calc) {
        this.calc = calc;
    }

    @Override
    public void run() {
        frame = new JFrame("Click Effect");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void createComponents(Container container) {

        GridLayout layout = new GridLayout(2, 1);
        container.setLayout(layout);

        JLabel jLabel = new JLabel(Integer.toString(calc.giveValue()));
        JButton click = new JButton("Click!");

        ClickListener listener = new ClickListener(calc, jLabel);
        click.addActionListener(listener);

        container.add(jLabel);
        container.add(click);
    }
}
