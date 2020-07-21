package Java8.epamLamda_StreamsTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Avg_IntList {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		List<Integer> numbers = new ArrayList<Integer>();
		System.out.println("How many numbers Do you want to Enter");
		int count = input.nextInt();
		System.out.println("Enter the Numbers");
		for (int i = 0; i < count; i++) {
			numbers.add(input.nextInt());
		}
		numbers.stream().mapToInt(i -> i).average().ifPresent(avg -> System.out.println("The Average is " + avg));
		input.close();
	}
}
