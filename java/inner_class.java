class inner_class{
    int a = 20;
   public void m1(){
    int b = 30;
    class inner{
        int c = 50;
        void m2(){
            System.out.println(a+ " "+b+ " "+ c);
        }
    }
    inner i = new inner();
    i.m2();
   }
    
   
    public static void main(String[] args) {
        new inner_class().m1();
    }
}