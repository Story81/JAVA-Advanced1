package org.example;

/**
 @author Solomennikova N.
 @version 1.0 (первый вариант решения Задания №1)
 */
import java.util.Scanner; //импортируем класс Scanner
import java.text.DecimalFormat; // импортируем класс DecimalFormat, который позволяет форматировать
                                // представление десятичных чисел с использованием предопределенного шаблона

public class App {
    public static void main(String[] args) {
        /*
          num1 - first number
          num2 - second number
          simb - arithmetic operations: "+", "-", "*" or "/"
          res - calculation result
          */

        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = scan.nextFloat();
        System.out.print("Введите второе число: ");
        float num2 = scan.nextFloat();

        System.out.print("Введите действие : ");
        String simb = scan.nextLine();
        simb = scan.nextLine();

        float res;
        DecimalFormat format = new DecimalFormat("#0.0000"); //указываем формат числа для вывода результата вычислений


        switch (simb) {
            //прописываем цикл для вычислений, в зависимости от вводимого арифметического знака: "+", "-", "*", "/"
            case "+":
                res = num1 + num2;
                System.out.println("Сумма чисел = " + format.format(res));
                break;
            case "-":
                res = num1 - num2;
                System.out.println("Разность чисел =" + format.format(res));
                break;
            case "*":
                res = num1 * num2;
                System.out.println("Произведение чисел = " + format.format(res));
                break;
            case "/":
                if (num2 == 0) System.out.println("на ноль делить нельзя");
                else {
                    res = num1 / num2;
                    System.out.println("Частное чисел = " + format.format(res));
                    break;
                }
        }
    }
}