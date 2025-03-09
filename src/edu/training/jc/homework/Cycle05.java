package edu.training.jc.homework;

// С помощью оператора while напишите программу определения суммы всех нечетных чисел в диапазоне от 1 до 99 включительно.
public class Cycle05 {

	public static void main(String[] args) {
		int num = 1;
		
		int sum = 0;
		
		while (num <= 99) {
			if (num % 2 != 0) {
				sum += num;
			}
			num++;
		}
		System.out.println("Сумма всех нечетных чисел в диапазоне от 1 до 99 включительно равна: " + sum);
	}

}
