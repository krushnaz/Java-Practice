import java.awt.*;
public class AWT_label {
    public static void main(String[] args) {
       Frame f = new Frame();
       Label l1, l2;
       l1 = new Label("this is the first label");
       l2 = new Label("this is the second label");

       l1.setBounds(50, 100, 100, 30);
       l2.setBounds(350, 150, 100, 30);

       f.add(l1);
       f.add(l2);

       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);
       

    }
}
