package composition;

public class Main {

    public static void main(String[] args) {
        Student student1 = new Student("Sue Shoe", 23);
        Student student2 = new Student("Bob Fredrickson", 32);
        Address address1 = new Address("750 Main St.", "55555", "Wisconsin", "414-262-5555");
        Address address2 = new Address("555 1st North St.", "51515", "Illinois", "262-414-5555");
       Info info1 = new Info(student1, address1);
       Info info2 = new Info(student2, address2);


        System.out.println(info1.getInfo());
        System.out.println(info2.getInfo());
    }
}
