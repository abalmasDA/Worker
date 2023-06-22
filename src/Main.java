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

    public static void main(String[] args) {
        Scanner scannerInputData = new Scanner(System.in);
        int numberWorkers = 5;
        List<Worker> listWorkers = new ArrayList<>();

        System.out.println("Enter data for 5 employees:");
        for (int i = 0; i < numberWorkers; i++) {
            System.out.println("Worker " + (i + 1) + ":");
            System.out.print("FullName: ");
            String fullName = scannerInputData.nextLine();
            System.out.print("Position: ");
            String position = scannerInputData.nextLine();
            System.out.print("Year of employment: ");
            int yearOfEmployment = 0;
            try {
                yearOfEmployment = Integer.parseInt(scannerInputData.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("Помилка формату року!");
                System.exit(0);
            }
            Worker newWorker = new Worker(fullName, position, yearOfEmployment);
            listWorkers.add(newWorker);
        }

        listWorkers.sort(Comparator.comparing(Worker::getFullName, String.CASE_INSENSITIVE_ORDER));
        System.out.print("Введіть рік для перевірки стажу: ");
        int searchYear = 0;
        try {
            searchYear = Integer.parseInt(scannerInputData.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Помилка формату року!");
            System.exit(0);
        }

        System.out.println("Працівники зі стажем більше " + searchYear + ":");

//        boolean foundWorkers = false;
//
//        for (Worker worker : listWorkers) {
//            if (worker.getWorkExperience() > searchYear) {
//                System.out.println(worker.getFullName());
//                foundWorkers = true;
//            }
//        }
//
//        if (!foundWorkers) {
//            System.out.println("Немає працівників зі стажем більше " + searchYear);
//        }



    }

}
