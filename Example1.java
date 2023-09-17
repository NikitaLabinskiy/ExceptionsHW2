package org.example;
//Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение.
//Ввод текста вместо числа не должно приводить к падению приложения,
//вместо этого, необходимо повторно запросить у пользователя ввод данных.

import java.util.Scanner;

public class Example1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float number = PrintNumber(scanner);
        System.out.println(number);
    }
    public static float PrintNumber(Scanner scanner){
        boolean flag = true;
        float number = 0.0F;
        while (flag){
            try {
                System.out.print("Введите число: ");
                number = Float.parseFloat(scanner.nextLine());
                flag = false;
            }catch (RuntimeException e){
                System.out.println("Данные введены не корректно!");
                flag = true;
            }
        }
        return number;
    }
}
