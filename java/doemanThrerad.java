public class doemanThrerad extends Thread {
    public void run(){
        if(Thread.currentThread().isDaemon()){
            System.out.println("working");
        }
        else{
            System.out.println("not working");
        }
    }
    public static void main(String[] args) {
        doemanThrerad t1 = new doemanThrerad();
        doemanThrerad t2 = new doemanThrerad();
        doemanThrerad t3 = new doemanThrerad();
        t1.setDaemon(true);
        t1.start();
       
        System.out.println( t1.getPriority());
        t2.start();
        System.out.println( t2.getPriority());

        t3.start();
        System.out.println( t3.getPriority());

    }
}
