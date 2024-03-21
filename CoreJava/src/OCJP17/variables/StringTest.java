package OCJP17.variables;

public class StringTest {
    public static void main(String[] args) {
        int x=5;
        int y=7;
        String Hello="hello";
        String world="world";
        String b= world.substring(1,2);
        System.out.println("result is"+b);
        StringBuilder sb= new StringBuilder("12");
        sb.append("3456",1,3);
        sb.insert(0,new char[]{'1','0','c','b','3','m','n'},2,3);
        System.out.println(sb);

    }

}
