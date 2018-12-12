
public class Apartment {

    private int rooms;
    private int squareMeters;
    private int pricePerSquareMeter;

    public Apartment(int rooms, int squareMeters, int pricePerSquareMeter) {
        this.rooms = rooms;
        this.squareMeters = squareMeters;
        this.pricePerSquareMeter = pricePerSquareMeter;
    }

    public boolean larger(Apartment otherApt) {
        return squareMeters > otherApt.squareMeters;
    }

    public int priceDifference(Apartment otherApt) {
        //int price = squareMeters * pricePerSquareMeter;
        return Math.abs(squareMeters * pricePerSquareMeter
             - otherApt.squareMeters * otherApt.pricePerSquareMeter);
    }

    public boolean moreExpensiveThan(Apartment otherApt) {
        return (this.squareMeters *     this.pricePerSquareMeter >
            otherApt.squareMeters * otherApt.pricePerSquareMeter);
    }
}
