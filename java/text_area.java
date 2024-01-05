import java.awt.*;
import java.awt.event.*;

public class text_area extends Frame implements ActionListener {
    Label l1,l2;
    TextArea t1;
    Button b;
    Checkbox c1;

    text_area(){
        l1 = new Label();    
        l1.setBounds(50, 50, 100, 30);    
        l2 = new Label();    
        l2.setBounds(160, 50, 100, 30);    
        t1 = new TextArea();    
        t1.setBounds(20, 100, 300, 300);    
        b = new Button("Count Words");    
        b.setBounds(100, 400, 100, 30);  
        c1 = new Checkbox("c++");
        c1.setBounds(300,500,50,60);
         
        b.addActionListener(this);
      
        add(l1);
        add(l2);
        add(t1);
        add(b);
        add(c1);
        setSize(400,400);
        setVisible(true);
        setLayout(null);

    }
    public void actionPerformed(ActionEvent e){
        String text = t1.getText();
        String words[] = text.split("\\s");
        l1.setText("words :"+words.length);
        l2.setText("character :"+text.length());
    }
    public static void main(String[] args) {
        new text_area();
    }
}
