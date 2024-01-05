class deatails{
    int pro_id;
    String pro_name;
    int pro_prize;
    int quantity;
    static int count=0;

    deatails(int pid, String pname,int pprize,int qty){
         pro_id = pid;
         pro_name = pname;
         pro_prize = pprize;
         quantity = qty;
    }
    void disp(){
     System.out.println("product num :"+count++ +" product id :"+pro_id+" product name :"+pro_name+" product prize :"+pro_prize+" product quantity :"+quantity);
    }

}
public class pro_details {
    public static void main(String[] args) {
        deatails d[] = new deatails[5];
        d[0]  = new deatails(01,"dell gaming laptop", 66500, 10);

        d[1] =new deatails(01,"hp gaming laptop", 66500, 10);

        d[2] = new deatails(01,"acer gaming laptop", 66500, 10);

        d[3]= new deatails(01,"lenovo gaming laptop", 66500, 10);

        d[4] = new deatails(01,"asus gaming laptop", 66500, 10);

       d[0].disp();
System.out.println();
       d[1].disp();
System.out.println();
       d[2].disp();
System.out.println();
       d[3].disp();
System.out.println();
       d[4].disp();


    }
}
