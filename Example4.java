package org.example;
//Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

import java.util.Scanner;

public class Example4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = null;
        try{
            string = CreateString(scanner);
        }catch (RuntimeException e){
            System.out.println("Пустые строки вводить нельзя!!!");
        }finally {
            System.out.println(string);
        }
    }
    public static String CreateString(Scanner scanner){
        System.out.print("Введите строку: ");
        String string = scanner.nextLine();
        if(string.isEmpty() || string == null){
            throw new RuntimeException();
        }
        return string;
    }
}
