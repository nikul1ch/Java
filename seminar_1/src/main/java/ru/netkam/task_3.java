//Реализовать простой калькулятор

package ru.netkam;

import java.util.Scanner;

public class task_3 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        double result;
        
        System.out.print("Введите первое число: ");
        double number1 = reader.nextDouble();
        System.out.print("Введите второе число: ");
        double number2 = reader.nextDouble();

        System.out.print("Введите оператор (+, -, *, /): ");
        char operator = reader.next().charAt(0);
        switch(operator) {
            case '+': result = number1 + number2;
            break;
            case '-': result = number1 - number2;
            break;
            case '*': result = number1 * number2;
            break;
            case '/': result = number1 / number2;
            break;
        default:  System.out.printf("Ошибка ввода. Запустите программу повторно");
        return;
    }
    if(number2 == 0 & operator == '/'){
        System.out.print("Ошибка. Нельзя делить на 0");  
    }
    else{
        System.out.print("\nРезультат " + number1 + " " + operator + " " + number2 + " = " + result);  
    }
    }
}
