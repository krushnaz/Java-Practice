import java.awt.*;
import java.awt.event.*;

public class TrafficSignal extends Frame implements ActionListener {
    private Label signalLabel;
    private Button redButton, yellowButton, greenButton;

    public TrafficSignal() {
        setTitle("Traffic Signal");
        setSize(200, 300);
        setLayout(new GridLayout(4, 1));

        signalLabel = new Label("Click to change the signal");
        add(signalLabel);

        redButton = new Button("RED");
        redButton.addActionListener(this);
        add(redButton);

        yellowButton = new Button("YELLOW");
        yellowButton.addActionListener(this);
        add(yellowButton);

        greenButton = new Button("GREEN");
        greenButton.addActionListener(this);
        add(greenButton);

        setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == redButton) {
            signalLabel.setText("STOP - RED Signal");
            signalLabel.setForeground(Color.RED);
        } else if (e.getSource() == yellowButton) {
            signalLabel.setText("READY - YELLOW Signal");
            signalLabel.setForeground(Color.YELLOW);
        } else if (e.getSource() == greenButton) {
            signalLabel.setText("GO - GREEN Signal");
            signalLabel.setForeground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new TrafficSignal();
    }
}
