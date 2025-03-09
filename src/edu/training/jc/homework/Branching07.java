package edu.training.jc.homework;

// Составить программу нахождения модуля выражения a*x*x + b*x + c при заданных значениях a, b, c и х
public class Branching07 {

	public static void main(String[] args) {
		int a = 2, b = 7, c = 4, x = 3;

		int result = Math.abs(a * x * x + b * x + c);

		System.out.println("Результат: " + result);
	}

}
