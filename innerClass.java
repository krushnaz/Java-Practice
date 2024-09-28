import java.io.PrintStream;  
class inner$Class  
{  
    final Outer this$0;  
    Outer$Inner()  
    {   super();  
        this$0 = Outer.this;  
    }  
    void msg()  
    {  
        System.out.println((new StringBuilder()).append("data is ")  
                    .append(Outer.access$000(Outer.this)).toString());  
    }  
}  