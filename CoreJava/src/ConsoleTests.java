import java.io.Console;
import java.util.Arrays;

public class ConsoleTests {
    public static void main(String[] args) {
        Console console= System.console();
        if(console!=null){
            String name=console.readLine("What is your name?");

            console.format("hello %s! %n",name);
            console.printf("--------".repeat(6));
            console.writer().println("-".repeat(30));
            char[] password1=console.readPassword("enter a new password");
            char[] password2=console.readPassword("re-enter the password");
            if(Arrays.equals(password2,password1)) {
                console.printf("password set successfully");
            }
            else
            {
                console.printf("password do not match");
            }
        }
        else{
            System.out.println("console not found");
        }

    }
}
