public class TrigonometricFunctions {
    public static void main(String[] args) {
        double angle = 90;
        double angleRadian = Math.toRadians(angle);
        // System.out.println(angleRadian);
        double sinOfNum = Math.sin(angleRadian);
        double cosineOfNum = Math.cos(angleRadian);
        double tangentOfNum = Math.tan(angleRadian);

        double secOfNum = (1/sinOfNum);
        double cosecOfNum = (1/cosineOfNum);
        double cotOfNum = (1/tangentOfNum);

        System.out.println("sin("+angle+") = "+sinOfNum);
        System.out.println("cos("+angle+") = "+cosecOfNum);
        System.out.println("tan("+angle+") = "+tangentOfNum);

        System.out.println("------------------------------");

        System.out.println("sec("+angle+") = "+secOfNum);
        System.out.println("cosec("+angle+") = "+cosecOfNum);
        System.out.println("cot("+angle+") = "+cotOfNum);  
    }
}
