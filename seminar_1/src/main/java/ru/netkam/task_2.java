//Вывести все простые числа от 1 до 1000

package ru.netkam;

public class task_2
{
    public static void main( String[] args )
    {
        int[] array_numbers = new int[999];
        for (int i = 0; i < array_numbers.length; i++) {
            array_numbers[i] = i+2;
        }

        for (int i = 0; i < array_numbers.length; i++) {
            if (array_numbers[i] == 0){
                continue;}
            else {
                int temp_prime_number = array_numbers[i];
                for (int j = i+1; j < array_numbers.length; j++){
                    if(array_numbers[j] %temp_prime_number == 0){
                        array_numbers[j] = 0;
                    }
                }
            }             
        }
        System.out.print("Все простые числа от 1 до 1000: ");
        for (int i = 0; i < array_numbers.length; i++) {
            if (array_numbers[i] != 0){    
                System.out.print(array_numbers[i] + ", ");
            }
        }
    }
}