import java.util.ArrayList;

public class Program {

    public static void main(String[] args) {

        String test = "abcd";
        test.charAt(0);

        String a = "erik";
        char b = 'R';
        System.out.println(a + b);

        PasswordRandomizer randomizer = new PasswordRandomizer(13);
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());
        System.out.println("Password: " + randomizer.createPassword());

    }
}
