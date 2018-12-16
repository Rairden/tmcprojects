public class Main {
  public static void main(String[] args) {
    Person thomas = new Person("Thomas", 1, 3, 1955);
    Person pekka = new Person("Pekka", 15, 2, 1993);
    Person erik = new Person("Erik", 29, 7, 1984);

    System.out.println( thomas.getName() + " age " + thomas.age() + " years");
    System.out.println( pekka.getName() + " age " + pekka.age() + " years");
    System.out.println( erik.getName() + " age " + erik.age() + " years");

    Person pekka2 = new Person("Pekka2", 15, 2, 1983);
    Person martin = new Person("Martin", 1, 3, 1983);

    System.out.println( martin.getName() + " is older than " +  pekka2.getName() + ": "+ martin.olderThan(pekka2) );
    System.out.println( pekka2.getName() + " is older than " +  martin.getName() + ": "+ pekka2.olderThan(martin) );



  }
}
