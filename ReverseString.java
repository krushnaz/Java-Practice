public class ReverseString {
   
    public static void main(String arg[]) {
        // System.out.println("hello, welcome to the 75 days challenge");
        // Using StringBuffer class
        
        StringBuffer SB = new StringBuffer("FirstDay");
        System.out.println("the reverse string is :" + SB.reverse());
         

        // using iterative method
        // In this method, first we convert given string to char array using charArray()
        // method. And then we iterate that array in the reverse order.
     
        String str ="FirstDay";
        char[] strArray = str.toCharArray();
        System.out.println("reverse string using iterative method :");
        for(int i = strArray.length - 1; i >= 0;i--){
            System.out.print(strArray[i]);
        }
         
        //  Using recursive method 
        //Here is the method which reverses the string by calling itself recursively.
        System.out.println();
         String revsredStr = reverse("Firstday");
         System.out.println(revsredStr);
    }
    static String reverse(String str){
        if(str == null || str.length() <= 1){
            return str;
        }
        return reverse(str.substring(1))+ str.charAt(0);
    }
}