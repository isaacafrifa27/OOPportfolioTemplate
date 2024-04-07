import java.util.ArrayList;

public class Firm {
    public static void main(String[] args) {
        Staff personnel = new Staff();

        personnel.addEmployee(new Executive("Isaac", "123", 200000.0));
        personnel.addEmployee(new Hourly("Afrifa", "456", 50.0, 40));
        personnel.addEmployee(new Volunteer("Abdullah", "789"));

        personnel.setVacationOptions();

        personnel.payday();
    }
}

class Staff {
    private ArrayList<Employee> employees;

    public Staff() {
        employees = new ArrayList<>();
    }

    public void addEmployee(Employee e) {
        employees.add(e);
    }

    public void payday() {
        for (Employee e : employees) {
            System.out.println(e);
            System.out.println("Payment: " + e.pay());
            System.out.println();
        }
    }

    public void setVacationOptions() {
        for (Employee e : employees) {
            e.setVacationDays();
        }
    }
}

abstract class Employee {
    private String name;
    private String id;

    public Employee(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract double pay();

    public void setVacationDays() {
        System.out.println("Default vacation options for " + name);
    }

    @Override
    public String toString() {
        return "Name: " + name + ", ID: " + id;
    }
}

class Executive extends Employee {
    private double salary;

    public Executive(String name, String id, double salary) {
        super(name, id);
        this.salary = salary;
    }

    @Override
    public double pay() {
        return salary;
    }

    @Override
    public void setVacationDays() {
        System.out.println("Executive vacation options for " + super.toString() + ": 4 weeks");
    }
}

class Hourly extends Employee {
    private double hourlyRate;
    private int hoursWorked;

    public Hourly(String name, String id, double hourlyRate, int hoursWorked) {
        super(name, id);
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double pay() {
        return hourlyRate * hoursWorked;
    }

    @Override
    public void setVacationDays() {
        System.out.println("Hourly employee vacation options for " + super.toString() + ": 1 week");
    }
}

class Volunteer extends Employee {
    public Volunteer(String name, String id) {
        super(name, id);
    }

    @Override
    public double pay() {
        return 0; // Volunteers don't get paid
    }

    @Override
    public void setVacationDays() {
        System.out.println("Volunteer vacation options for " + super.toString() + ": No vacation");
    }
}
