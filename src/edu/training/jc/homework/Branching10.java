package edu.training.jc.homework;

// Составить программу, которая определит площадь какого круга меньше.
public class Branching10 {

	public static void main(String[] args) {
		double r1 = 3, r2 = 4;

		double s1, s2;

		s1 = Math.PI * Math.pow(r1, 2);
		s2 = Math.PI * Math.pow(r2, 2);

		if (s1 == s2) {
			System.out.printf("Площади кругов равны (s1 = %.2f; s2 = %.2f)\n", s1, s2);
		} else if (s1 < s2) {
			System.out.printf("Площадь первого круга(s1 = %.2f) меньше второго(s2 = %.2f)\n", s1, s2);
		} else {
			System.out.printf("Площадь второго круга(s2 = %.2f) меньше первого(s1 = %.2f)\n", s2, s1);
		}
	}

}
