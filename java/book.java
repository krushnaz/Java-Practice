import java.util.*;
public class book {
    String name,uthor,publisher;
    int Quantity;
    book(String name,String uthor,String publisher,int Quantity){
       this.name = name;
       this.uthor = uthor;
       this.publisher = publisher;
       this.Quantity =Quantity;
    }
    public static void main(String[] args) {
        book b1 = new book("harry porter", "j.k.rowling", "nirali", 50000);
        book b2 = new book("harry porter", "j.k.rowling", "nirali", 50000);
        book b3 = new book("harry porter", "j.k.rowling", "nirali", 50000);
        book b4 = new book("harry porter", "j.k.rowling", "nirali", 50000);
        
        List<book> l1 = new ArrayList<book>();
        l1.add(b1);
        l1.add(b2);
        l1.add(b3);
        l1.add(b4);

        for(book b : l1){
            System.out.println(b.name+" "+b.uthor +" "+b.publisher+" "+b.Quantity);
        }
    }
}
