public class interferenceThread {
    int i;
    public void method(){
        i=10;
        System.out.println(i);
        i=20;
        System.out.println(i);
        i=30;
        System.out.println(i);
    }
    public static void main(String[] args) {
       final interferenceThread m1 = new interferenceThread();
        Thread t1 = new Thread(){
            public void run(){
                m1.method();
            }
        };

        Thread t2 = new Thread(){
            public void run(){
                m1.method();
            }
        };
        t1.start();
        t2.start();
    }
}
