import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число");
        double num1 = scanner.nextDouble();

        boolean validInput = false;
        while (!validInput) {
            System.out.println("Введите второе число");
            double num2 = scanner.nextDouble();

            System.out.println("Какую операцию Вы хотите сделать?");
            System.out.println(" 1(сложение) 2(вычетание) 3(умножение) 4(деление)");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    double sum = num1 + num2;
                    System.out.println("сумма" + sum);
                    validInput = true;
                    break;

                case 2:
                    double minus = num1 - num2;
                    System.out.println("разность" + minus);
                    validInput = true;
                    break;

                case 3:
                    double mnojit = num1 * num2;
                    System.out.println("произведение" + mnojit);
                    validInput = true;
                    break;

                case 4:
                    if (num2 != 0) {
                        double delit = num1 / num2;
                        System.out.println("деление" + delit);
                        validInput = true;
                    } else {
                        System.out.println("  ну кто же делит на нуль. Давай попробуем ещё раз");
                    }
                    break;

                default:
                    System.out.println("Вы выбрали неверную операцию. Повторите выбор.");
                    break;
            }
        }
    }
    }