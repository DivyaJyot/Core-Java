package com.divya;

public class TextExample {
    static public void main(String[] args) {
        String s1 = """
                a \
                b \t
                c \s 
                """;

        System.out.println(s1.length() + " " + s1.split("\\n").length);
       // test1();
        s1.charAt(2);

    }

    private static void test1() {
        String s1 = """
                Hey,I \
                am Divya""";//bserve the single backslash (\) at the end of the second line. It tells the compiler to not insert a new line character
        String s2 = "Hey,I am Divya";
        System.out.println(s1.substring(1, 10));
        System.out.println(s1.equals(s2));
        System.out.println(s1);
        int INT1 = 1, INT2 = 3;

        int i = INT1;
        do {
            System.out.println(i);
        } while (i++ < INT2);
    }
}
