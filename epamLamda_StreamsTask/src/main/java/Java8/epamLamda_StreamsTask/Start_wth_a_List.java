package Java8.epamLamda_StreamsTask;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Start_wth_a_List {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		List<String> names = new ArrayList<String>();
		System.out.println("How many ***Strings*** do you want to Enter:");
		int stringCount = input.nextInt();
		System.out.println("Enter the Strings:");
		for (int i = 0; i <= stringCount; i++) {
			names.add(input.nextLine());
		}
		List<String> result = names.stream().filter(s -> s.startsWith("a") && s.length() == 3)
				.collect(Collectors.toList());
		System.out.println("List of String Start with Letter 'a' and having exactly 3 letters only:");
		System.out.println(result);
		input.close();
	}
}
