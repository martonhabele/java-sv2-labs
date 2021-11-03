package literals;

public class LiteralsMain {
    public static void main(String[] args) {
        System.out.println("2" + "2");
        String twoPlusTwo = "2" + "2";

        double quotient = 3 / 4;            //This is a bad idea...
        System.out.println(quotient);       //This shows it
        quotient = 3d / 4d;
        System.out.println(quotient);       //This will work :)
        quotient = 3.0 / 4.0;
        System.out.println(quotient);       //This will work too :)

        long big = 3_244_444_444L;
        System.out.println(big);

        String word = "title".toUpperCase();
        System.out.println(word);

        System.out.println(Integer.toBinaryString(1));
        System.out.println(Integer.toBinaryString(-2));
    }
}