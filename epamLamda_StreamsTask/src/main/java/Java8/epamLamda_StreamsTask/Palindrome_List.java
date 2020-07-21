package Java8.epamLamda_StreamsTask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class Palindrome_List {
	public static void main(String args[]) {
		List<String> strList = Arrays.asList("bob", "varun", "dada", "adda", "amma", "kaka", "LOL");
		List<String> list2 = pal(strList);
		for (String i : list2)

			System.out.println(i);

	}

	static List<String> pal(List<String> l3) {
		List<String> PalinList = new ArrayList<String>();
		for (String i : l3) {
			String t = i.replaceAll("\\s+", "").toLowerCase();
			if (IntStream.range(0, t.length() / 2).noneMatch(j -> t.charAt(j) != t.charAt(t.length() - j - 1)))
				PalinList.add(i);
		}
		System.out.println("List of Palindromes from given list of words: ");
		return PalinList;

	}
}
