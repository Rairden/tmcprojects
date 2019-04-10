import containers.ProductContainer;
import containers.ProductContainerRecorder;

public class Main {

    public static void main(String[] args) {

        ProductContainer juice = new ProductContainer("Juice", 1000.0);
        juice.addToTheContainer(1000.0);
        juice.takeFromTheContainer(11.3);
        System.out.println(juice.getName());    // Juice
        System.out.println(juice);              // volume = 988.7, free space 11.3
        printLine();

        // the well known way:
        ProductContainerRecorder juice2 = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice2.takeFromTheContainer(11.3);
        System.out.println(juice2.getName());   // Juice
        juice2.addToTheContainer(1.0);
        System.out.println(juice2);             // Juice: volume = 989.7, free space 10.3

        System.out.println(juice2.history());   // [1000.0]
        printLine();

        ProductContainerRecorder juice3 = new ProductContainerRecorder("Juice", 1000.0, 1000.0);
        juice3.takeFromTheContainer(11.3);
        juice3.addToTheContainer(1.0);
        System.out.println(juice3.history());   // [1000.0, 988.7, 989.7]

        juice3.printAnalysis();
    }


    private static void printLine() {
        System.out.println("--------------------------------------------");
    }
}
