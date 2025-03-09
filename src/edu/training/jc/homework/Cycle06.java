package edu.training.jc.homework;

import java.util.Scanner;

// Напишите программу, где пользователь вводит любое целое положительное число. А программа суммирует все числа от 1 до введенного пользователем числа.
public class Cycle06 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		int sum = 0;

		try {
			System.out.print("Введите целое положительное число: ");
			 if (input.hasNextInt()) {
				 num = input.nextInt();
				 if (num > 0) {
						for (int i = 1; i <= num; i++) {
							sum += i;
						}
						System.out.printf("Результат суммы чисел от 1 до %d равна: %d", num, sum);
					} else {
						System.out.println("Некорректный ввод. Введите положительное число.");
					}
			 } else {
				 System.out.println("Некорректный ввод. Пожалуйста, введите целое число.");
			 }
		} finally {
			input.close();
		}

	}

}
