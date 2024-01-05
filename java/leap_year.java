public class leap_year {
    public static void main(String[] args) {
      boolean isleap;
      int year = 2021;
      isleap = (year % 4 == 0);
      isleap =isleap && (year % 400 == 0 || year % 100 != 0);
      if(((year % 4 == 0) || (year % 400 == 0)) && year % 100 != 0){
        System.out.println("this is leap year");
        
      }
      else{
        System.out.println("this is not leap year");

      }
    }
}
