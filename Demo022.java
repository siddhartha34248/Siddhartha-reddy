class Friend {
    String name, phone, address;

    public Friend(String name, String phone, String address) {
        this.name = name;
        this.phone = phone;
        this.address = address;
    }

    public void display() {
        System.out.println("Name: " + name + ", Phone: " + phone + ", Address: " + address);
    }
}

public class Demo022 {
    public static void main(String[] args) {
        Friend[] friends = {
                new Friend("Bharath", "1234567890", "123"),
                new Friend("nandhu", "9876543210", "456"),
                new Friend("Raju", "5555555555", "789"),
                new Friend("pandu", "4444444444", "321"),
                new Friend("Dieep", "3333333333", "654")
        };
        for (Friend friend : friends)
            friend.display();
    }
}