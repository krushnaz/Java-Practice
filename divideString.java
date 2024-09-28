public class divideString {
    public static void main(String[] args) {
        String str = "krushnaaa";
        int len =str.length();
        
        int n= 3,temp = 0, chars = len/n;
        String [] equalsStr = new String[n];
        if(len % n != 0){
            System.out.println("we can't divide this String");
        }
        else{
            for(int i=0;i<len;i+=chars){
                String part = str.substring(i, i+chars);
                equalsStr[temp] = part;
                temp++;
            }
          System.out.println(n+"equals parts of the given String");
          for(int i= 0;i<equalsStr.length;i++){
            System.out.println(equalsStr[i]);
          }
        }

    }
}