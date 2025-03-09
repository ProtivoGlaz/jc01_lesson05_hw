package edu.training.jc.homework;

// С помощью оператора while напишите программу вывода всех четных чисел в диапазоне от 2 до 100 включительно.
public class Cycle04 {

	public static void main(String[] args) {
		int num = 2;
		while (num <= 100) {
			System.out.println(num);
			num += 2;
		}
	}

}
