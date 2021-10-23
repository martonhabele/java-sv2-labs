package stringtype;

public class StringTypeMain {
    public static void main(String[] args) {
        String prefix = "Hello";
        String name = "John Doe";
        String message = prefix + " " + name;
        message += 444;

        boolean b = message.equals("Hello John Doe");
        boolean c = message.equals("Hello John Doe444");

        System.out.println(message);
        System.out.println(b);
        System.out.println(c);

        String i = "";
        String j = "";
        String k = i + j;
        System.out.println(k + " length: " + k.length());   //k.length will always be 0

        System.out.println("Abcde".length());
        System.out.println("Abcde".charAt(0) + ", " + "Abcde".charAt(2));
        System.out.println("Abcde".substring(0, 3));
    }
}