import java.awt.*;
import java.awt.event.*;

public class MouseAndWindowListenerExample extends Frame implements MouseListener, WindowListener {

    MouseAndWindowListenerExample() {
        setTitle("Mouse and Window Listener Example");
        setSize(300, 200);

        addMouseListener(this); // Registering mouse listener
        addWindowListener(this); // Registering window listener

        setVisible(true);
    }

    // MouseListener methods
    public void mouseClicked(MouseEvent e) {
        System.out.println("Mouse Clicked at: " + e.getX() + ", " + e.getY());
    }

    public void mousePressed(MouseEvent e) {
        System.out.println("Mouse Pressed at: " + e.getX() + ", " + e.getY());
    }

    public void mouseReleased(MouseEvent e) {
        System.out.println("Mouse Released at: " + e.getX() + ", " + e.getY());
    }

    public void mouseEntered(MouseEvent e) {
        System.out.println("Mouse Entered");
    }

    public void mouseExited(MouseEvent e) {
        System.out.println("Mouse Exited");
    }

    // WindowListener methods
    public void windowOpened(WindowEvent e) {
        System.out.println("Window Opened");
    }

    public void windowClosing(WindowEvent e) {
        System.out.println("Window Closing");
        dispose(); // Close the window
    }

    public void windowClosed(WindowEvent e) {
        System.out.println("Window Closed");
    }

    public void windowIconified(WindowEvent e) {
        System.out.println("Window Iconified");
    }

    public void windowDeiconified(WindowEvent e) {
        System.out.println("Window Deiconified");
    }

    public void windowActivated(WindowEvent e) {
        System.out.println("Window Activated");
    }

    public void windowDeactivated(WindowEvent e) {
        System.out.println("Window Deactivated");
    }

    public static void main(String[] args) {
        new MouseAndWindowListenerExample();
    }
}
