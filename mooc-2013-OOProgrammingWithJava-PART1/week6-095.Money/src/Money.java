
public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        if (cents > 99) {
            euros += cents / 100;
            cents %= 100;
        }
        this.euros = euros;
        this.cents = cents;
    }

    public Money plus(Money added) {
     // return new Money(this.euros() + added.euros(), this.cents() + added.cents());  // this saves 22 bytes
        Money sum = new Money(this.euros + added.euros, this.cents + added.cents);
        return sum;
    }

    // if this < that, return true
    public boolean less(Money compared) {
        if (this.euros < compared.euros) {
            return true;
        } else if (this.euros == compared.euros && this.cents < compared.cents) {
            return true;
        } else {
            return false;
        }
    }

    public Money minus(Money decremented) {
        Money zero = new Money(0, 0);
        if (this.less(decremented)) {
            return zero;
        } else {
            if (this.euros >= decremented.euros && this.cents >= decremented.cents) {
                return new Money(this.euros - decremented.euros, this.cents - decremented.cents);
            } else /* this.cents < decremented.cents */ {
                return new Money(this.euros - decremented.euros - 1, 100 - decremented.cents + this.cents);
            }
        }
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    @Override
    public String toString() {
        String zero = "";
        if (cents < 10) {
            zero = "0";
        }
        return euros + "." + zero + cents + "e";
    }
}