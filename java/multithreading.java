public class multithreading extends Thread {
    public void run(){
        Thread th = Thread.currentThread();
        long name = th.getId();
        for(int i = 0; i < 10; i++){
            System.out.println("run method" +" "+name);
        //     try{

        // // join();
        // // Thread.sleep(250);
        //     }
        //     catch(InterruptedException e){
        //         System.out.println(e);
        //     }
        }
    }
    public static void main(String[] args) throws InterruptedException {
        multithreading m1 = new multithreading();
        Thread th = Thread.currentThread();
      long name = th.getId();
        m1.start();
        m1.join(4000);

        for(int i =0 ; i < 10; i++){
            System.out.println("main method" +" "+name );
          
            
        }
    }
}
