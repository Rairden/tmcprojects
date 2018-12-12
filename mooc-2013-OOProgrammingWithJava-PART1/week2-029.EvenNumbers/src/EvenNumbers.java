
public class EvenNumbers {

    public static void main(String[] args) {
        int a = 2;
        while (a % 2 == 0 && a <= 100) {
            System.out.println(a);
            a += 2;
        }
    }
}
