import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class practice implements ActionListener, Runnable {
    private JTextField textField;
    private JButton startButton;
    private volatile boolean running = false;

    public practice(JTextField textField, JButton startButton) {
        this.textField = textField;
        this.startButton = startButton;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (!running) {
            running = true;
            startButton.setText("Stop");
            Thread thread = new Thread(this);
            thread.start();
        } else {
            running = false;
            startButton.setText("Start");
        }
    }

    @Override
    public void run() {
        int i = 1;
        while (running) {
            textField.setText(Integer.toString(i));
            i++;
            if (i > 100) {
                i = 1;
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Number Displayer");
        JTextField textField = new JTextField(10);
        textField.setEditable(false);
        JButton startButton = new JButton("Start");
        practice displayer = new practice(textField, startButton);
        startButton.addActionListener(displayer);
        JPanel panel = new JPanel();
        panel.add(textField);
        panel.add(startButton);
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
