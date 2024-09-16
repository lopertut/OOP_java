package org.lopertut;

import java.lang.reflect.Array;

public class App {
    public void run() {
        Address address = new Address();
        address.setCity("Narva");
        address.setState("Ida-Virumaa");
        address.setStreet("puskina");
        address.setHouse("23");
        address.setRoom("42");
        address.setZip("59028");

        Person person1 = new Person("Artur", "Matvejev", 2006, 6, 13, address);
        Person person2 = new Person("Maksim", "Korolev", 2007, 22, 9, address);
        Employee employee1 = new Employee(person1, "director", "3000");
        Employee employee2 = new Employee(person2, "employee", "1900");

        Employee[] employees = {employee1, employee2};

        for (int i = 0; i < employees.length; i++) {
            System.out.println("name: " + employees[i].getPerson().getName());
            System.out.println("surname: " + employees[i].getPerson().getSurname());
            System.out.println("birthyear: " + employees[i].getPerson().getBirthday_year());
            System.out.println("birthmonth: " + employees[i].getPerson().getBirthday_month());
            System.out.println("birthday: " + employees[i].getPerson().getBirthday_day());
            System.out.println("address: " + employees[i].getPerson().getAddress().getCity());
            System.out.println("appointment: " + employees[i].getAppointment());
            System.out.println("salary: " + employees[i].getSalary());
            System.out.println("  ");
        }
    }
}
