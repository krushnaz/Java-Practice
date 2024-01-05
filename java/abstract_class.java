abstract class person{
    String subject;
    int sal;
    person(String subject,int sal){
        this.subject = subject;
        this.sal = sal;
    }
}
class student extends person{
    int roll_no;
    String name;
    student(int roll_no,String name,String subject,int sal){
        super(subject,sal);
        this.roll_no = roll_no;
        this.name = name;
    }
    void disp(){
        System.out.println(roll_no + " "+ name+" "+subject+" "+sal);
    }
}
public class abstract_class {
    public static void main(String[] args) {
        student s1 = new student(10, "krushna", "java", 200000);
        s1.disp();
    }
}
