package org.exampleV2;

/**
 @author Solomennikova N.
 @version 2.0 (второй авриант решение Задания№1 с созданием методов)
 */
import java.util.Scanner; //импортируется класс Scanner

public class AppV2 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        float num1 = scan.nextFloat();             //считываем значение первого числа, введенного из консоли
        System.out.print("Введите второе число: ");
        float num2 = scan.nextFloat();             //считываем значение второго числа, введенного из консоли

        System.out.print("Введите действие : ");
        String simb = scan.nextLine();             //считываем знак математической операции, производимой над числами
        simb = scan.nextLine();


        switch (simb) {
            //прописываем цикл для вычислений, в зависимости от вводимого арифметического знака: "+", "-", "*", "/"
            case "+":
                System.out.printf("Сумма чисел = %.4f\n", sum(num1, num2));
                break;
            case "-":
                System.out.printf("Разность чисел = %.4f\n", subtract(num1, num2));
                break;
            case "*":
                System.out.printf("Произведение чисел = %.4f\n", multiply(num1, num2));
                 break;
            case "/":
                if (num2 == 0) System.out.println("на ноль делить нельзя");
                else {
                System.out.printf("Частное чисел =  %.4f\n", divide(num1, num2));
                break;
                }
        }
    }
    /**
     * @see #sum(float, float) метод определяет сумму двух чисел
     * @param a Значение первого числа
     * @param b Значение второго числа
     * @return Возвращает сумму двух чисел
     */
    public static float sum(float a, float b) {
        return a + b;
    }
    /**
     * @see #subtract(float, float) метод определяет разность двух чисел
     * @param a Значение первого числа
     * @param b Значение второго числа
     * @return Возвращает разность двух чисел
     */
    public static float subtract(float a, float b) {
        return a - b;
    }
    /**
     * @see #multiply(float, float) метод определяет произведение двух чисел
     * @param a Значение первого числа
     * @param b Значение второго числа
     * @return Возвращаем произведение двух чисел
     */
    public static float multiply(float a, float b) {
        return a * b;
    }
    /**
     * @see #divide(float, float)  метод определяет частное от деления двух чисел
     * @param a Первое расчётное значение
     * @param b Второе расчётное значение
     * @return Возвращаем частное от деления двух чисел
     */
    public static float divide(float a, float b) {
        return a / b;
    }
}