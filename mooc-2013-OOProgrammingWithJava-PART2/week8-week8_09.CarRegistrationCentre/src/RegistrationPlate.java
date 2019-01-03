import java.util.Objects;

public class RegistrationPlate {
    // don't change the code which is already given to you
    // ATTENTION: the object variable types are final, meaning that their value cannot be changed!

    private final String country;
    private final String regCode;

    public RegistrationPlate(String country, String regCode) {
        this.country = country;
        this.regCode = regCode;
    }

    @Override
    public String toString() {
        return country + " " + regCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegistrationPlate that = (RegistrationPlate) o;
        return Objects.equals(regCode, that.regCode) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(regCode, country);
    }
}