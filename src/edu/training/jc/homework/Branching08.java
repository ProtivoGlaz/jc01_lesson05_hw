package edu.training.jc.homework;

// Составить программу нахождения наименьшего из квадратов двух чисел а и b.
public class Branching08 {
	public static void main(String[] args) {
		int a = 6, b = 5;
		
		if (Math.pow(a, 2) == Math.pow(b, 2)) {
			System.out.println("Равны");
		} else if (Math.pow(a, 2) < Math.pow(b, 2)) {
			System.out.println("Квадрат числа a меньше квадрата b");
		} else {
			System.out.println("Квадрат числа b меньше квадрата a");
		}
	}
}
