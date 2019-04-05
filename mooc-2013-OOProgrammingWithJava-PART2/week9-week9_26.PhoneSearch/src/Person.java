public class Person {

    public String name;
    private String phoneNumber;
    private String streetAddr;
    private String city;

    public Person() {
        this.name        = "";
        this.phoneNumber = "";
        this.streetAddr  = "";
        this.city        = "";
    }

    public Person(String name) {
        this.name = name;
        this.phoneNumber = "";
        this.streetAddr  = "";
        this.city        = "";
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
