public class Main {
    public static void main(String[] args) {

        PromissoryNote mattisNote = new PromissoryNote();
        mattisNote.setLoan("Arto", 51.5);
        mattisNote.setLoan("Mikael", 30);

        System.out.println(mattisNote.howMuchIsTheDebt("Arto"));
        System.out.println(mattisNote.howMuchIsTheDebt("Joel"));

        System.out.println("-------------------------------");

        PromissoryNote mattisNote2 = new PromissoryNote();
        mattisNote2.setLoan("Arto", 51.5);
        mattisNote2.setLoan("Arto", 10.5);

        System.out.println(mattisNote2.howMuchIsTheDebt("Arto"));
    }
}
