import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 * Створіть проект за допомогою IntelliJ IDEA. Потрібно: Описати клас з ім'ям Worker, що містить такі поля:
 *  прізвище та ініціали працівника;
 *  назва посади;
 *  рік надходження на роботу.
 * Написати програму, яка виконує такі дії:
 *  введення з клавіатури даних до масиву, що складається з п'яти елементів типу Worker (записи мають бути впорядковані за абеткою);
 *  якщо значення року введено не у відповідному форматі, видає виняток.
 *  виведення на екран прізвища працівника, стаж роботи якого перевищує введене значення.
 */


public class Main {
    static Scanner scannerInputData = new Scanner(System.in);

    public static void main(String[] args) {
        final int CURRENT_DATE = 2023;
        List<Employee> listEmployees = new ArrayList<>();
        listEmployees.add(setInfoEmployee());
        listEmployees.add(setInfoEmployee());
        listEmployees.add(setInfoEmployee());
        listEmployees.add(setInfoEmployee());
        listEmployees.add(setInfoEmployee());
        listEmployees.sort(Comparator.comparing(Employee::getSurName, String.CASE_INSENSITIVE_ORDER));

        System.out.print("Enter the year of experience:");
        int yearExperience = scannerInputData.nextInt();
        System.out.println("Employees with more experience presented below");
        for (int i = 0; i < listEmployees.size(); i++) {
            if (getEmployeeWorkExperience(listEmployees, CURRENT_DATE, i) > yearExperience) {
                System.out.println(listEmployees.get(i).getSurName());
            }
        }

    }

    public static Employee setInfoEmployee() {
        System.out.print("Name of employment: ");
        String name = scannerInputData.nextLine();
        System.out.print("Surname of employment: ");
        String surName = scannerInputData.nextLine();
        System.out.print("Middle name of employment: ");
        String middleName = scannerInputData.nextLine();
        System.out.print("Position: ");
        String position = scannerInputData.nextLine();
        System.out.print("Year of employment: ");
        int yearOfEmployment = 0;
        try {
            yearOfEmployment = Integer.parseInt(scannerInputData.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("You entered wrong");
            System.exit(0);
        }
        return new Employee(name, surName, middleName, position, yearOfEmployment);
    }

    public static int getEmployeeWorkExperience(List<Employee> listEmployees, int currentDate, int employeeNumber) {
        int employeeWorkExperience;
        return employeeWorkExperience = currentDate - listEmployees.get(employeeNumber).getYearOfEmployment();
    }


}
