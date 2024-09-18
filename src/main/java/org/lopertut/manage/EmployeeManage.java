package org.lopertut.manage;

import org.lopertut.Address;
import org.lopertut.Employee;
import org.lopertut.Person;

import java.util.Scanner;

public class EmployeeManage {
    Employee[] employees = new Employee[20];
    int employee_count = 0;
    Scanner scanner = new Scanner(System.in);

    public void create() {
        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee surname: ");
        String surname = scanner.nextLine();

        System.out.print("Enter employee birthyear: ");
        int birthyear = scanner.nextInt();

        System.out.print("Enter employee birthmonth: ");
        int birthmonth = scanner.nextInt();

        System.out.print("Enter employee birthday: ");
        int birthday = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Enter employee state: ");
        String state = scanner.nextLine();

        System.out.print("Enter employee city: ");
        String city = scanner.nextLine();

        System.out.print("Enter employee street : ");
        String street = scanner.nextLine();

        System.out.print("Enter employee house : ");
        String house = scanner.nextLine();

        System.out.print("Enter employee room: ");
        String room = scanner.nextLine();

        System.out.print("Enter employee zip: ");
        String zip = scanner.nextLine();

        System.out.print("Enter employee appointment : ");
        String appointment = scanner.nextLine();

        System.out.print("Enter employee salary: ");
        String salary = scanner.nextLine();


        Address address = new Address(state, city, street, house, room, zip);
        Person person = new Person(name, surname, birthyear, birthmonth, birthday, address);
        Employee employee = new Employee(person, appointment, salary);

        employees[employee_count] = employee;
        employee_count++;
    }



    public void list() {
        if (employee_count <= 0) {
            System.out.println("No employees to show.");
        } else {
            for (Employee employee: employees) {
                if (employee != null) {
                    System.out.println("name: " + employee.getPerson().getName());
                    System.out.println("surname: " + employee.getPerson().getSurname());
                    System.out.println("birthyear: " + employee.getPerson().getBirthday_year());
                    System.out.println("birthmonth: " + employee.getPerson().getBirthday_month());
                    System.out.println("birthday: " + employee.getPerson().getBirthday_day());
                    System.out.println("state: " + employee.getPerson().getAddress().getState());
                    System.out.println("city: " + employee.getPerson().getAddress().getCity());
                    System.out.println("street: " + employee.getPerson().getAddress().getStreet());
                    System.out.println("house: " + employee.getPerson().getAddress().getHouse());
                    System.out.println("zip: " + employee.getPerson().getAddress().getZip());
                    System.out.println("room: " + employee.getPerson().getAddress().getRoom());
                    System.out.println("appointment: " + employee.getAppointment());
                    System.out.println("salary: " + employee.getSalary());
                    System.out.println("  ");
                }
            }
        }
    }


    public void find_employee(String name, String surname) {
        for (Employee employee : employees) {
            if (employee != null && employee.getPerson().getName().equals(name) && employee.getPerson().getSurname().equals(surname)) {
                System.out.println("Name: " + employee.getPerson().getName());
                System.out.println("Surname: " + employee.getPerson().getSurname());
                System.out.println("Birthyear: " + employee.getPerson().getBirthday_year());
                System.out.println("Birthmonth: " + employee.getPerson().getBirthday_month());
                System.out.println("Birthday: " + employee.getPerson().getBirthday_day());
                System.out.println("State: " + employee.getPerson().getAddress().getState());
                System.out.println("City: " + employee.getPerson().getAddress().getCity());
                System.out.println("Street: " + employee.getPerson().getAddress().getStreet());
                System.out.println("House: " + employee.getPerson().getAddress().getHouse());
                System.out.println("Zip: " + employee.getPerson().getAddress().getZip());
                System.out.println("Room: " + employee.getPerson().getAddress().getRoom());
                System.out.println("Appointment: " + employee.getAppointment());
                System.out.println("Salary: " + employee.getSalary());
                System.out.println("  ");
            }
        }
    }
}
