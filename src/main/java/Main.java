import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String list = "";
        double result = 0.00;
        double price = 0;
        int people = 0;

        // Кол-во людей

        System.out.println("Количество людей для разделения счёта: ");
        while (true) {
            if (scanner.hasNextInt()) {
                people = scanner.nextInt();
                if (people > 1) {
                    break;
                } else {
                    System.out.println("Введено не корректное количество людей.");
                }
            } else {
                System.out.println("Введено не корректное значение, введите количество людей.");
            }
            scanner.nextLine();
        }

        // Стоймость и название товаров

        while (true) {
            System.out.println("Ведите название товара, если закончили перечислять, напишите \"Завершить\". ");
            String product = scanner.next();
            if (product.equalsIgnoreCase("завершить")) {
                break;
            }
            System.out.println("Ведите cтоймость товара: ");
            while (true) {
                if (scanner.hasNextDouble()) {
                    price = scanner.nextDouble();
                    if (price > 1) {
                        break;
                    } else if (price <= 1) {
                        System.out.println("Введено некорректное значение, попробуйте снова. ");
                    }
                } else {
                    System.out.println("Введено некорректное значение, попробуйте снова. ");
                    scanner.next();
                }

            }

            System.out.println("Товар добавден.");
            list = list.concat(product).concat("\n");
            result = result + price;
        }
        System.out.println("Добавленные товары: \n" + list);

        // Калькулятор

        Calculator calculator = new Calculator();
        calculator.calcul(result, people);

        scanner.close();
    }
}