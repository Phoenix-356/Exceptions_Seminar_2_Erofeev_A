import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {

    /*
       1. Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное
          значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно
          запросить у пользователя ввод данных.

       2. Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
          Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
     */

    public static void main(String[] args) {
        System.out.println("Здравствуйте!");  // - При включении приложения выводим приветственное сообщение.
        inputNumber();
    }

    public static void inputNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите ваше число.");
        try {                                   // - Проверяем блок кода, в котором может произойти исключение
            float input = scanner.nextFloat();  // - Запрашиваем ввод строго числовых значений (целых или дробных)
            System.out.println("Вот введенное вами число - " + input);  // - В случае корректного ввода отображаем
                                                                        //   введенное число.
        } catch (InputMismatchException e){  // - Определяем блок кода, в котором происходит исключение
            System.out.println("Вводиться могут лишь цифры и символ '.' для обозначения дробного числа.\n" +
                    "Попробуйте еще раз.");  // -Выводим текстовое сообщение о некорректности ввода числа
            inputNumber(); // - Рекурсивный вызов (только в случае исключения)
        }
    }



}