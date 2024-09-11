package org.lopertut;

public class App {
    public void run() {
        Address address = new Address();
        address.setCity("Narva");
        address.setState("Ida-Virumaa");
        address.setStreet("puskina");
        address.setHouse("23");
        address.setRoom("42");
        address.setZip("59028");

        Person person = new Person("Artur", "Matvejev", 2006, 6, 13, address);
        Employee employee = new Employee(person, "director", "3000");
        System.out.println("name: " + employee.getPerson().getName());
        System.out.println("surname: " + employee.getPerson().getSurname());
        System.out.println("birthyear: " + employee.getPerson().getBirthday_year());
        System.out.println("birthmonth: " + employee.getPerson().getBirthday_month());
        System.out.println("birthday: " + employee.getPerson().getBirthday_day());
        System.out.println("address: " + employee.getPerson().getAddress().getCity());
        System.out.println("appointment: " + employee.getAppointment());
        System.out.println("salary: " + employee.getSalary());

    }
}
