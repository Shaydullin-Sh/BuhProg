package entity;

import java.time.LocalDate;
import java.util.Objects;

//работник организации
public class Employee {
    private int id;
    private String name;
    private String lastName;
    private String patronymic;
    private String department;
    private LocalDate birthDate;
    private String phoneNumber;
    private String email;
    private double salary;

    public Employee() {
    }

    public Employee(String name,
                    String lastName,
                    String patronymic,
                    String department,
                    LocalDate birthDate,
                    String phoneNumber,
                    String email,
                    double salary) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.department = department;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;
        return id == employee.id && Double.compare(salary, employee.salary) == 0 && Objects.equals(name, employee.name) && Objects.equals(lastName, employee.lastName) && Objects.equals(patronymic, employee.patronymic) && Objects.equals(department, employee.department) && Objects.equals(birthDate, employee.birthDate) && Objects.equals(phoneNumber, employee.phoneNumber) && Objects.equals(email, employee.email);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + Objects.hashCode(name);
        result = 31 * result + Objects.hashCode(lastName);
        result = 31 * result + Objects.hashCode(patronymic);
        result = 31 * result + Objects.hashCode(department);
        result = 31 * result + Objects.hashCode(birthDate);
        result = 31 * result + Objects.hashCode(phoneNumber);
        result = 31 * result + Objects.hashCode(email);
        result = 31 * result + Double.hashCode(salary);
        return result;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", lastName='" + lastName + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", department='" + department + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                ", salary=" + salary +
                '}';
    }
}
