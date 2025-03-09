package edu.training.jc.homework;

// Составить программу: определения наименьшего из двух чисел а и b.
public class Branching05 {

	public static void main(String[] args) {
		int a = 5, b = 5;

		if (a == b) {
			System.out.println("Равны");
		} else if (a < b) {
			System.out.println("a меньше b");
		} else {
			System.out.println("b меньше a");
		}

	}

}
