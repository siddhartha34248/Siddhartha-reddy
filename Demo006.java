class Employee {

    protected int id;
    protected String firstName;
    protected String lastName;
    protected String address;
    
    public Employee() {}
    
    public Employee(int id, String firstName, String lastName, String address) {
        super();
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
    }
    
    public String getFullName(){
        return firstName + " " + lastName;
    }
    
    public int getId() {
        return id;
    }

    public String getAddress() {
        return address;
    }

    public void sendMessage(){
        System.out.println("Salary added successfully...");
    }
}

class FullTimeEmployee extends Employee {
    
    private double basic;
    private double bonus;

    public FullTimeEmployee() {}

    public FullTimeEmployee(int id, String firstName, String lastName, double basic, double bonus, String address) {
        super(id, firstName, lastName, address);
        this.basic = basic;
        this.bonus = bonus;
    }
    
    public double computeSal(){
        return basic + bonus;
    }
    
    public void showDetails(){
        System.out.println("Id : " + getId());  
        System.out.println("Name : " + getFullName());
        System.out.println("Grand Total : " + computeSal());
        System.out.println("Address : " + getAddress()); 
    }    
}

class PartTimeEmployee extends Employee {

    private double amountPerHour;
    private int hoursWorked;

    public PartTimeEmployee() {}

    public PartTimeEmployee(int id, String firstName, String lastName, double amountPerHour, int hoursWorked, String address) {
        super(id, firstName, lastName, address);
        this.amountPerHour = amountPerHour;
        this.hoursWorked = hoursWorked;
    }

    public double computeSal(){
        return amountPerHour * hoursWorked;
    }

    public void showDetails(){
        System.out.println("Id : " + getId());  
        System.out.println("Name : " + getFullName());
        System.out.println("Grand Total : " + computeSal());
        System.out.println("Address : " + getAddress()); 
    }    
}

public class Demo006 {

    public static void main(String[] args) {
        FullTimeEmployee fullTimeEmployee = new FullTimeEmployee(101, "Nampally", "Bharath", 6000, 2000, "7-65/2, Nagaram");
        fullTimeEmployee.showDetails();
        fullTimeEmployee.sendMessage();
    
        PartTimeEmployee partTimeEmployee = new PartTimeEmployee(102, "Raju", "Kumar", 150, 80, "8-64/3, Warangal");
        partTimeEmployee.showDetails();
        partTimeEmployee.sendMessage();
    }
}