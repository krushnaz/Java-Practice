interface Addition{
    public void add();
    default void printInfo(){
        System.out.println("default method");
    }
    static void displayInfo(){

    }
}
public class defaultInterface implements Addition {
    public void add(){

    }
    
}
