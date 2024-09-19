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
            System.out.println("tasks list:");
            System.out.println("0. Exit");
            System.out.println("1. add employee");
            System.out.println("2. employee list");
            System.out.println("3. find employee");
            System.out.println("4. edit employee data");
            System.out.print("print task: ");

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
                    break;
                default:
                    System.out.println("Error, not that number");
                    break;
            }
        }while (!exit) ;
            System.out.println("Goodbye!");
            scanner.close();
    }
}
