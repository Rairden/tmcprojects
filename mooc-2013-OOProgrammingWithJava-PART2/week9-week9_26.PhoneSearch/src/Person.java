public class Person {

    private String phoneNumber;
    private String streetAddr;
    private String city;

    public Person() {
    }

    public Person(String phoneNumber, String streetAddr, String city) {
        this.phoneNumber = phoneNumber;
        this.streetAddr = streetAddr;
        this.city = city;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getStreetAddr() {
        return streetAddr;
    }

    public String getCity() {
        return city;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setStreetAddr(String streetAddr) {
        this.streetAddr = streetAddr;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
