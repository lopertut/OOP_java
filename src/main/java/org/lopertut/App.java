package org.lopertut;

import java.util.Scanner;

public class App {
    Employee[] employees = new Employee[20];
    int employee_count = 0;
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


    private void employee_list() {
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
                    System.out.println("Exit...");
                    exit = true;
                    break;
                case 1:
                    create_employee();
                    break;
                case 2:
                    employee_list();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error, not that number");
                    break;
            }
        } while (!exit);
        System.out.println("Goodbye!");
        scanner.close();
    }
}
