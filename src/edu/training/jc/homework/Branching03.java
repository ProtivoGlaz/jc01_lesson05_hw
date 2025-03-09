package edu.training.jc.homework;

import java.util.Scanner;

// Составить программу сравнения введенного числа а и цифры 3. Вывести на экран слово «yes», если число а меньше 3; если больше, то вывести слово «no».
public class Branching03 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int a;

		System.out.print("Введите число: ");

		try {

			a = input.nextInt();

			if (a < 3) {
				System.out.println("yes");
			} else {
				System.out.println("no");
			}

		} finally {
			input.close();
		}
	}

}
