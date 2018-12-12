
import java.util.Scanner;

public class LengthOfName {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        // call your method from here
        System.out.println("Type your name:");
        int cnt1 = calculateCharacters(reader.nextLine());
        System.out.println("Number of characters: " + cnt1);
    }
    
    // do here the method
    public static int calculateCharacters(String text){
        int cnt = 0;
        for (int i = 0; i < text.length(); i++) {
            cnt++;
        }
        return cnt;
    }

    
}
