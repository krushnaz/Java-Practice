import java.util.ArrayList;
import java.util.Iterator;

class input{
    int id;
    String name;
    String address;
    input(int id,String name,String address){
      this.id = id;
      this.name = name;
      this.address = address;
    }
}
public class colloction_araylist {
    public static void main(String[] args) {
        input i1 = new input(01,"krushna","ghodegon");
        input i2 = new input(01,"krushna","ghodegon");
        input i3 = new input(01,"krushna","ghodegon");
        ArrayList<input> list = new ArrayList<input>();
        list.add(i1);
        list.add(i2);
        list.add(i3);
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            input it = ((input)itr.next());
            System.out.println(it.id + " "+it.name + " "+ it.address);
        }
        
    }
}
