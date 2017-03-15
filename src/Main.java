import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

	    // Создать простой калькулятор
        // Ввод значений
        // Выполнение простых арифметических операций
        // Вывод результата на консоль

        // Вызов библиотеки для ввода с клавиатуры
        Scanner scanner = new Scanner(System.in);
        // Объявляем переменные, тип double для работы с дробными числами
        double firstValue, secondValue, result = 0;
        String symbol;

        // Вывод приветствия при запуске приложения
        System.out.println("Calculator program is running...");
        // Предложение ввести первое число
        System.out.println("Введите первое число: ");
        // Считывается первое введённое число с клавиатуры в консоли
        firstValue = scanner.nextDouble();
        // Вывод сообщения на косоль, какое число ввели
        System.out.println("Вы ввели число " + firstValue);
        // Предложение ввести второе число (третье, четвёртое и т.д. если надо)
        System.out.println("Введите второе число: ");
        // Считывается второе введённое число с клавиатуры в консоли
        secondValue = scanner.nextDouble();
        // Вывод сообщения на косоль, какое число ввели
        System.out.println("Вы ввели число " + secondValue);
        // Предложение ввести тип операции (+, -, *, /, %)
        System.out.println("Введите тип операции(+, -, *, /, %):");
        // Считывается введённый знак с клавиатуры в консоли
        symbol = scanner.next();
        // Условие знак то действие
        if(symbol.equals("+")) {
            result = firstValue + secondValue;
        } else if(symbol.equals("-")) {
            result = firstValue - secondValue;
        } else if(symbol.equals("*")) {
            result = firstValue * secondValue;
        } else if(symbol.equals("/")) {
                if (secondValue == 0) {
                    System.out.println("На 0 делить нельзя. Пока!");
                    return;
                }
            result = firstValue / secondValue;
        } else {
            System.out.println(symbol + " - этот символ неправильный! Пока!!!");
        }

        System.out.println("результат операции: " + result);
    }
}
