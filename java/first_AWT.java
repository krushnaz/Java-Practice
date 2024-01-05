import java.awt.*;
public class first_AWT extends Frame {
    first_AWT(){
        Button b = new Button("click me!");
        b.setBounds(30,100,80,30);
        add(b);
        setSize(300,400);
        setTitle("none");
        setLayout(null);
        setVisible(true);
    }
    public static void main(String[] args) {
        first_AWT f1 = new first_AWT();
    }
}
