public class MilitaryService implements NationalService {

    private int daysLeft;

    public MilitaryService(int daysLeft) {
        this.daysLeft = daysLeft;
    }

    public int getDaysLeft() {
        return this.daysLeft;
    }

    public void work() {
        if (daysLeft > 0) {
            daysLeft--;
        }
    }

}