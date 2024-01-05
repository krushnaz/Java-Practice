import java.awt.*;
public class textfield {
    public static void main(String[] args) {
        Frame f = new Frame();
        TextField t1,t2;

        t1 = new TextField("this is first t1");
        t1.setBounds(50, 100, 100, 30);
        t2 = new TextField("this is second t2");
        t2.setBounds(350, 150, 100, 30);

        f.add(t1);
        f.add(t2);
        f.setSize(400,500);
        f.setLayout(null);
        f.setVisible(true);
    }
}
