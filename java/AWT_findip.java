import java.awt.*;
import java.awt.event.*;

class Label1 extends Frame implements ActionListener {
    Frame f = new Frame();
    TextField t;
    Label l;
    Button b;
    
    Label1(){
        t =new TextField();
        t.setBounds(50, 50, 150, 20);
        l = new Label();
        l.setBounds(50, 100, 250, 20);
        b = new Button("Find IP");    
        b.setBounds(50,150,60,30);    
        b.addActionListener(this);   


       f.add(t);
       f.add(l);
       f.add(b);
       
       f.setSize(400,400);
       f.setLayout(null);
       f.setVisible(true);

    }
    public void actionPerformed(ActionEvent e){
        try{

            String host = t.getText();
            String ip = java.net.InetAddress.getByName(host).getHostAddress(); 
            l.setText("ip of "+host+" is :"+ip);
        }
        catch(Exception e1){
            System.out.println(e1);
        }
    }

}

public class AWT_findip {
public static void main(String[] args) {
    new Label1();
}
}
