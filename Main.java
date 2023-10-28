import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Выберите задачу:");
        System.out.println("1. Проверка числа");
        System.out.println("2. Проверка имени");
        System.out.println("3. Вывод элементов массива кратных 3");

        int choice = scanner.nextInt();
        scanner.nextLine(); // Чтобы считать символ новой строки после выбора

        switch (choice) {
            case 1:
                System.out.println("Введите число: ");
                int number = scanner.nextInt();
                if (number > 7) {
                    System.out.println("Привет");
                }
            case 2:
                System.out.println("Введите имя: ");
                String name = scanner.nextLine();
                String result = "Вячеслав".equals(name) ? "Привет, Вячеслав" : "Нет такого имени";
                System.out.println(result);
                break;
            case 3:
                System.out.println("Введите элементы массива через пробел: ");
                String input = scanner.nextLine();
                String[] inputArray = input.split(" ");
                System.out.println("Элементы массива, кратные 3:");
                for (String element : inputArray) {
                    int num = Integer.parseInt(element);
                    if (num % 3 == 0) {
                        System.out.println(num);
                    }
                }
                break;
            default:
                System.out.println("Неправильный выбор.");
        }

        scanner.close();
    }
}




