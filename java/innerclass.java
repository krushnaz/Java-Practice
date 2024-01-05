public class innerclass {
    int a = 20;
    class inner{
        void test(){
            System.out.println(a);
        }
    }
    public static void main(String[] args) {
       innerclass i = new innerclass();
       innerclass.inner in = i.new inner();

        in.test();
    }
}
