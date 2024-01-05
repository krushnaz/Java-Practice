import java.awt.*;
import java.awt.event.*;
public class AWT_outer extends Frame{
    AWT_outer(){
      TextField tf = new TextField();
      tf.setBounds(60,120,50,30);
      Button b = new Button("click me");
      b.setBounds(30,60,100,60);
      Outer o = new Outer(this);

    }
    public static void main(String args[]){  
        new AWT_event();  
        } 
}
class Outer extends AWT_event implements ActionListener{
    AWT_outer obj;
    Outer(AWT_outer obj){
      this.obj = obj;
    }
    public void actionPerformed(ActionEvent e){
     obj.tf.setText("welcome");
    }
}
