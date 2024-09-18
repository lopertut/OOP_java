package org.lopertut;

import org.lopertut.manage.EmployeeManage;

import java.util.Scanner;

public class App {
    public void run() {
        boolean exit = false;
        Scanner scanner = new Scanner(System.in);
        EmployeeManage employeeManage = new EmployeeManage();

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
                    employeeManage.create();
                    break;
                case 2:
                    employeeManage.list();
                    break;
                case 3:
                    employeeManage.findEmployee();
                    break;
                case 4:
                    employeeManage.editEmployee();
                default:
                    System.out.println("Error, not that number");
                    break;
            }
        }while (!exit) ;
            System.out.println("Goodbye!");
            scanner.close();
    }
}
