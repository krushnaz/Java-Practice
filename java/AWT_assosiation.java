import java.awt.*;
public class AWT_assosiation {
    AWT_assosiation(){
        Frame f = new Frame();
        Label l = new Label("employee id :");
        Button b = new Button("submit");
        TextField t = new TextField();
        l.setBounds(20,80,80,30);
        b.setBounds(20,100,80,30);
        t.setBounds(80,100,80,30);
        f.add(l);
        f.add(b);
        f.add(t);
        f.setSize(300,400);
        f.setTitle("this is second awt");
        f.setLayout(null);
        f.setVisible(true);

    }
    public static void main(String[] args) {
        AWT_assosiation a1 =new AWT_assosiation();
    }
}
