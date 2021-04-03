package allprogram.Java1_8.lambdaExp;

public class SimplifyLambdaExpression {
    public static void main(String[] args) {
        String s = "ABCD";
        int length= getLength(s);
        //Integer len = ()->{return s.length();};
        System.out.println(length);
    }

    private static int getLength(String s) {
        return s.length();
    }
}
