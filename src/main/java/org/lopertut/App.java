package org.lopertut;

import java.util.Scanner;

public class App {

    Scanner scanner = new Scanner(System.in);
    private void create_employee() {
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
    }


    public void run() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("HR");
        System.out.println("---------------------");
        do {
            System.out.println("Список задач:");
            System.out.println("0. Exit");
            System.out.println("1. Добавить работника");
            System.out.println("2. Список всех работников");
            System.out.println("3. Работники по имени и фамилии");
            System.out.print("Выберите задачу: ");

            int choice = scanner.nextInt();
            switch (choice) {
                case 0:
                    System.out.println("Выход из программы");
                    exit = true;
                    break;
                case 1:
                    create_employee();
                    break;
                case 2:
                    System.out.println("2 задача");
                    break;
                case 3:
                    System.out.println("3 задача");
                default:
                    System.out.println("Error, not that number");
                    break;
            }
        } while (!exit);
        System.out.println("heat aega!");
        scanner.close();




//        Address address = new Address();
//        address.setCity("Narva");
//        address.setState("Ida-Virumaa");
//        address.setStreet("puskina");
//        address.setHouse("23");
//        address.setRoom("42");
//        address.setZip("59028");
//
//        Person person1 = new Person("Artur", "Matvejev", 2006, 6, 13, address);
//        Person person2 = new Person("Maksim", "Korolev", 2007, 22, 9, address);
//        Employee employee1 = new Employee(person1, "director", "3000");
//        Employee employee2 = new Employee(person2, "employee", "1900");
//
//        Employee[] employees = {employee1, employee2};
//
//        for (int i = 0; i < employees.length; i++) {
//            System.out.println("name: " + employees[i].getPerson().getName());
//            System.out.println("surname: " + employees[i].getPerson().getSurname());
//            System.out.println("birthyear: " + employees[i].getPerson().getBirthday_year());
//            System.out.println("birthmonth: " + employees[i].getPerson().getBirthday_month());
//            System.out.println("birthday: " + employees[i].getPerson().getBirthday_day());
//            System.out.println("address: " + employees[i].getPerson().getAddress().getCity());
//            System.out.println("appointment: " + employees[i].getAppointment());
//            System.out.println("salary: " + employees[i].getSalary());
//            System.out.println("  ");

    }
}
