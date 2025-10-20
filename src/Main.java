import java.util.Scanner ;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double middleResult = 0.0;

        System.out.println("Введите первое число");
        middleResult = scanner.nextDouble();

      boolean keepCalculating = true;
      while (keepCalculating) {
          System.out.println("Какую операцию Вы хотите сделать?");
          System.out.println("1(+) 2(-) 3(*) 4(/) 5(Выйти из программы)");
          int choiсe = scanner.nextInt();

          if(choiсe == 5) {
              System.out.println("Вы вышли из программы");
              break;
          }

          System.out.println("Введите второе число");
          double num2 = scanner.nextDouble();

          switch (choiсe) {
              case 1:
               middleResult = middleResult + num2;
                  System.out.println("сумма" + middleResult);
                  break;

              case 2:
                  middleResult = middleResult - num2;
                  System.out.println("разность" + middleResult);
                  break;

              case 3:
                  middleResult = middleResult * num2;
                  System.out.println("произведение" +middleResult);
                  break;

              case 4:
                  if (num2 != 0) {
                      middleResult = middleResult / num2;
                      System.out.println("деление" + middleResult);
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





