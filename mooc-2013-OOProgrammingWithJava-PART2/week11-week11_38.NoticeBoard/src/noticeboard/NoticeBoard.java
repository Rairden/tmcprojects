package noticeboard;

import java.awt.Container;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class NoticeBoard implements Runnable {

    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("");
        frame.setPreferredSize(new Dimension(500, 300));

        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        createComponents(frame.getContentPane());

        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
    }

    private void createComponents(Container container) {
        GridLayout layout = new GridLayout(3, 1);
        container.setLayout(layout);

        JTextField textAreaTop = new JTextField();
        JLabel textAreaBottom = new JLabel();
        JButton copyButton = new JButton("Copy!");

        ActionEventListener listener = new ActionEventListener(textAreaTop, textAreaBottom);
        copyButton.addActionListener(listener);

        container.add(textAreaTop);
        container.add(copyButton);
        container.add(textAreaBottom);
    }
}
