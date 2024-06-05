class Employee {
    String emp_name;
    int emp_id;
    String address;
    String email_id;
    long mob_no;
    double basicPay;

    public Employee(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        this.emp_name = emp_name;
        this.emp_id = emp_id;
        this.address = address;
        this.email_id = email_id;
        this.mob_no = mob_no;
        this.basicPay = basicPay;
    }

    public void generatePaySlip() {
        double da = 0.97 * basicPay;
        double hra = 0.1 * basicPay;
        double pf = 0.12 * basicPay;
        double staffClubFund = 0.001 * basicPay;
        double grossSalary = basicPay + da + hra;
        double Salary = grossSalary - pf - staffClubFund;

        System.out.println("Employee Name: " + emp_name);
        System.out.println("Employee ID: " + emp_id);
        System.out.println("Address: " + address);
        System.out.println("Mail ID: " + email_id);
        System.out.println("Mobile No: " + mob_no);
        System.out.println("Basic Pay: " + basicPay);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + staffClubFund);
        System.out.println("Gross Salary: " + grossSalary);
        System.out.println("Net Salary: " + Salary);
    }
}

class Programmer extends Employee {
    public Programmer(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProgrammer Pay Slip:");
        super.generatePaySlip();
    }
}

class Assistant_Professor extends Employee {
    public Assistant_Professor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssistant Professor Pay Slip:");
        super.generatePaySlip();
    }
}

class Associate_Professor extends Employee {
    public Associate_Professor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nAssociate Professor Pay Slip:");
        super.generatePaySlip();
    }
}

class Professor extends Employee {
    public Professor(String emp_name, int emp_id, String address, String email_id, long mob_no, double basicPay) {
        super(emp_name, emp_id, address, email_id, mob_no, basicPay);
    }

    @Override
    public void generatePaySlip() {
        System.out.println("\nProfessor Pay Slip:");
        super.generatePaySlip();
    }
}

public class Demo1 {
    public static void main(String args[]) {
        Programmer programmer = new Programmer("Ram", 1, "Pune", "ram@1234.com", 1234567890, 50000.0);
        Assistant_Professor assistant_professor = new Assistant_Professor("Sham", 2, "Mumbai", "sham@1234.com", 1456789230, 60000.0);
        Associate_Professor associate_professor = new Associate_Professor("Geeta", 3, "Pune", "geeta@1234.com", 1236789450, 70000.0);
        Professor professor = new Professor("Sita", 4, "Mumbai", "sita@1234.com", 1234589670, 80000.0);

        programmer.generatePaySlip();
        assistant_professor.generatePaySlip();
        associate_professor.generatePaySlip();
        professor.generatePaySlip();
    }
}