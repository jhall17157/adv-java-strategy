package composition;

public class Info {
    private Address address;
    private Student student;
    public Info (Student student, Address address) {
        this.student = student;
        this.address = address;
    }
    public String getInfo() {
        return student.getName() + " " + student.getAge() + " " + address.getStreetAddress() + " " + address.getState() + " " + address.getZipCode() + " " + address.getPhone();
    }
}
