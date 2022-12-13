//Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)
package ru.netkam;

import java.util.Scanner;

public class task_1 
{
    static Scanner in = new Scanner(System.in);

    public static void main( String[] args )
    {
        System.out.print( "Введите целое число:" );
        int number = in.nextInt();
        
        int sum = 0;
        int multiply = 1;

        for (int i = 1; i < number + 1; i++) {
            sum += i;
            multiply *= i;
        }
        
        System.out.println("Сумма чисел от 1 до " + number + ": " + sum);
        System.out.println("Произведение чисел от 1 до " + number + ": " + multiply);
    }
}
