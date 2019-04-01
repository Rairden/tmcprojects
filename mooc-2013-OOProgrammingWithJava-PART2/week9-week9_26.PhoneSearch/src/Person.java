public class Person {

    private String name;
    private String phoneNumber;
    private String streetAddr;
    private String city;

    public Person() {
    }

    public Person(String name, String phoneNumber, String streetAddr, String city) {
        this.name        = name;
        this.phoneNumber = phoneNumber;
        this.streetAddr  = streetAddr;
        this.city        = city;
    }

    public String getName() {
        return name;
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

    public void setName(String name) {
        this.name = name;
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
