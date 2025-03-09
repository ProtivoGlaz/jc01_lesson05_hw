package edu.training.jc.homework;

// Необходимо вывести на экран таблицу умножения на 3
public class Cycle03 {

	public static void main(String[] args) {
		int num = 3;

		for (int i = 1; i <= 10; i++) {
			int res = num * i;
			System.out.printf("%d * %d = %d\n", num, i, res);
		}
	}

}
