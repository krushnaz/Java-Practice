// class one extends Thread{    
//     public void run(){    
//      for(int i=1;i<=5;i++){    
//       try{    
//        Thread.sleep(500);    
//       }catch(Exception e){System.out.println(e);}    
//      System.out.println(i);    
//      }    
//     }    
//    public static void main(String args[]){    
//     one t1= new one();    
//     one t2=new one();    
//     one t3=new one();    
//     t1.start();    
//     try{    
//      t1.join(1500);    
//     }catch(Exception e){System.out.println(e);}    
       
//     t2.start();    
//     t3.start();    
//     }    
//    }    

class one extends Thread{
    public void run(){
       for(int i=0;i<5;i++){
        System.out.println(i);
       
    }
    }
    public static void main(String[] args) {
            one t1= new one();   
            one t2= new one();   
            one t3= new one();   
            // t1.start();
            // t2.start();

            // for(int i=10;i<15;i++){
            //  System.out.println(i);
            //  System.out.println("current thread name :-"+Thread.currentThread().getName());
            // }
            
              t2.start();
              Thread.MAX_PRIORITY = 10;
            
            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
            System.out.println(t3.getPriority());

            //set priority
            t1.setPriority(1);
            t2.setPriority(6);
            t1.setPriority(10);
            System.out.println();
            System.out.println(t1.getPriority());
            System.out.println(t2.getPriority());
            System.out.println(t3.getPriority());

            System.out.println(t1.getName());
            System.out.println(t2.getName());
            System.out.println(t3.getName());
            }

         }
    
