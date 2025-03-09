package edu.training.jc.homework;

import java.util.Scanner;

// Составить программу, которая определит по трем введенным сторонам, является ли данный треугольник равносторонним.
public class Branching09 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		double a, b, c;

		try {
			System.out.print("Введите чему равна первая сторона треугольника: ");
			a = input.nextDouble();

			System.out.print("Введите чему равна вторая сторона треугольника: ");
			b = input.nextDouble();

			System.out.print("Введите чему равна третья сторона треугольника: ");
			c = input.nextDouble();

			if (a == b && b == c) {
				System.out.println("Треугольник равносторонний");
			} else if (a == b || b == c || a == c) {
				System.out.println("Треугольник равнобедренный");
			} else {
				System.out.println("Треугольник разносторонний");
			}

		} finally {
			input.close();
		}
	}

}
