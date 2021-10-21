package localvariables;

public class LocalVariablesMain {
    public static void main(String[] args) {

        boolean b = true;
        System.out.println(b);

        b = false;
        System.out.println(b);

        int a = 2;
        System.out.println(a);

        int i = 3;
        int j = 4;
        int k = i;
        System.out.println("i = " + i + ", j = " + j + ", k = " + k);

//        double unInitialized;
//        System.out.println(unInitialized); this will throw a compiler error, of course

        String s = "Hello World";
        String t = s;
        System.out.println(t);

        {
            int x = 0;
            System.out.println(x);
            System.out.println(a);
        }
//        System.out.println(x); won't work :)
    }
}