package org.lopertut;

import java.util.Objects;

public class Employee {
    private Person person;
    private String appointment;
    private String salary;

    public Employee() {
    }

    public Employee(Person person, String appointment, String salary) {
        this.person = person;
        this.appointment = appointment;
        this.salary = salary;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public String getAppointment() {
        return appointment;
    }

    public void setAppointment(String appointment) {
        this.appointment = appointment;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(person, employee.person) && Objects.equals(appointment, employee.appointment) && Objects.equals(salary, employee.salary);
    }

    @Override
    public int hashCode() {
        return Objects.hash(person, appointment, salary);
    }
}
