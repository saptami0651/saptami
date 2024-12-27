// Import necessary libraries
import java.util.*;

// Define a class called "Employee"
class Employee {
    private String name;
    private int age;
    private double salary;

    // Constructor to initialize employee objects
    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    // Getters and setters for employee attributes
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

// Define a class called "Department"
class Department {
    private String name;
    private List<Employee> employees;

    // Constructor to initialize department objects
    public Department(String name) {
        this.name = name;
        this.employees = new ArrayList<>();
    }

    // Method to add employees to the department
    public void addEmployee(Employee employee) {
        this.employees.add(employee);
    }

    // Method to print department information
    public void printDepartmentInfo() {
        System.out.println("Department Name: " + this.name);
        System.out.println("Number of Employees: " + this.employees.size());
    }

    // Method to print employee information
    public void printEmployeeInfo() {
        for (Employee employee : this.employees) {
            System.out.println("Employee Name: " + employee.getName());
            System.out.println("Employee Age: " + employee.getAge());
            System.out.println("Employee Salary: " + employee.getSalary());
            System.out.println();
        }
    }
}

// Define a class called "Company"
class Company {
    private String name;
    private List<Department> departments;

    // Constructor to initialize company objects
    public Company(String name) {
        this.name = name;
        this.departments = new ArrayList<>();
    }

    // Method to add departments to the company
    public void addDepartment(Department department) {
        this.departments.add(department);
    }

    // Method to print company information
    public void printCompanyInfo() {
        System.out.println("Company Name: " + this.name);
        System.out.println("Number of Departments: " + this.departments.size());
    }

    // Method to print department information
    public void printDepartmentInfo() {
        for (Department department : this.departments) {
            department.printDepartmentInfo();
            System.out.println();
        }
    }

    // Method to print employee information
    public void printEmployeeInfo() {
        for (Department department : this.departments) {
            department.printEmployeeInfo();
            System.out.println();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Create company objects
        Company company1 = new Company("ABC Corporation");
        Company company2 = new Company("XYZ Inc.");

        // Create department objects
        Department department1 = new Department("Sales");
        Department department2 = new Department("Marketing");
        Department department3 = new Department("IT");

        // Create employee objects
        Employee employee1 = new Employee("John Doe", 30, 50000.0);
        Employee employee2 = new Employee("Jane Doe", 25, 40000.0);
        Employee employee3 = new Employee("Bob Smith", 40, 60000.0);

        // Add employees to departments
        department1.addEmployee(employee1);
        department1.addEmployee(employee2);
        department2.addEmployee(employee3);

        // Add departments to companies
        company1.addDepartment(department1);
        company1.addDepartment(department2);
        company2.addDepartment(department3);

        // Print company information
        company1.printCompanyInfo();
        company2.printCompanyInfo();

        // Print department information
        company1.printDepartmentInfo();
        company2.printDepartmentInfo();

        // Print employee information
        company1.printEmployeeInfo();
        company2.printEmployeeInfo();
    }
}