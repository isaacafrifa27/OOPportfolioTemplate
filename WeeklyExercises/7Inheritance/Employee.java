class Hospital {
    public int emp_ID;
    public String emp_Name;
    public String emp_department;
    public String emp_work_type;

    public Hospital(int emp_ID, String emp_Name, String emp_department, String emp_work_type) {
        this.emp_ID = emp_ID;
        this.emp_Name = emp_Name;
        this.emp_department = emp_department;
        this.emp_work_type = emp_work_type;
    }
}

class Doctor extends Hospital {
    public String emp_role;

    public Doctor(int emp_ID, String emp_Name, String emp_department, String emp_work_type, String emp_role) {
        super(emp_ID, emp_Name, emp_department, emp_work_type);
        this.emp_role = emp_role;
    }

    public void getDoctorDetails() {
        System.out.println("Doctor details:");
        System.out.println("Employee ID: " + this.emp_ID);
        System.out.println("Name: " + this.emp_Name);
        System.out.println("Department: " + this.emp_department);
        System.out.println("Work type: " + this.emp_work_type);
        System.out.println("Role: " + this.emp_role);
    }

    public void performSurgery() {
        System.out.println(this.emp_Name + " is performing surgery.");
    }
}

class Nurse extends Hospital {

    public Nurse(int emp_ID, String emp_Name, String emp_department, String emp_work_type) {
        super(emp_ID, emp_Name, emp_department, emp_work_type);
    }

    public void provideCare() {
        System.out.println(this.emp_Name + " is providing care to patients.");
    }
}

class Receptionist extends Hospital {
    public Receptionist(int emp_ID, String emp_Name, String emp_department, String emp_work_type) {
        super(emp_ID, emp_Name, emp_department, emp_work_type);
    }

    public void handleInquiries() {
        System.out.println(this.emp_Name + " is handling inquiries at the reception.");
    }
}

class Cleaner extends Hospital {
    public Cleaner(int emp_ID, String emp_Name, String emp_department, String emp_work_type) {
        super(emp_ID, emp_Name, emp_department, emp_work_type);
    }

    public void clean() {
        System.out.println(this.emp_Name + " is cleaning the hospital.");
    }
}

public class Employee {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor(2345, "Magdalene Afrifa", "Surgery", "Brain Surgeon", "Surgeon");
        doctor1.getDoctorDetails();
        doctor1.performSurgery();

        Nurse nurse1 = new Nurse(1234, "Jack Butland", "Emergency", "ER Nurse");
        nurse1.provideCare();

        Receptionist receptionist1 = new Receptionist(5678, "James Kofi", "Front Desk", "Receptionist");
        receptionist1.handleInquiries();

        Cleaner cleaner1 = new Cleaner(7890, "Jamal Abdullah", "Facilities", "Janitorial");
        cleaner1.clean();
    }
}
