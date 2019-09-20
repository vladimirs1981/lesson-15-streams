package exercises;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class AlgorithmsUsingStreams {

	public static long countGoodEggs(List<String> eggs) {
		return eggs.stream() // 1. create stream
				.filter(egg -> egg.equals("whole")) // 2. intermediate filter operation
				.count(); // 3. terminal operation: reduce to an int
	}

	public static Object findTallest(List<Double> peeps) {
//		return Collections.max(peeps);
		return peeps.stream().sorted(Comparator.reverseOrder()).findFirst().get();
	}

	public static long addStringOfNumbers(String numbers) {
		return numbers.chars().mapToObj(c -> Character.toString(c)).mapToInt(num -> Integer.parseInt(num)).sum();
	}

	public static long countPearls(List<Boolean> oysters) {

		return oysters.stream().filter(oyster -> oyster.equals(true)).count();

	}

	public static Object findLongestWord(List<String> words) {

		return words.stream().max(Comparator.comparingInt(String::length)).get();

	}

	public static List<Double> sortScores(List<Double> results) {

		return results.stream().sorted((o1, o2) -> o1.compareTo(o2)).collect(Collectors.toList());

	}

	public static List<String> sortDNA(List<String> unsortedSequences) {

		return unsortedSequences.stream().sorted((s1, s2) -> s1.length() - s2.length()).collect(Collectors.toList());

	}

	public static List<String> sortWords(List<String> words) {
		// TODO Auto-generated method stub
		return words.stream().sorted().collect(Collectors.toList());
	}

	public static Object getDistinctSpellsInAlphabeticalOrder(List<String> spellsCastThisWeek) {

		return spellsCastThisWeek.stream().distinct().sorted().collect(Collectors.toList());

	}

	public static  Object getBatPhrases(String[] batmanScript) {
		 return Arrays.stream(batmanScript)
				 .filter(word -> word.contains("Bam") || word.contains("Pow"))
				 .map(name -> name.toUpperCase())
				 .map(s -> s.replaceAll("\\s",""))
		        .collect(Collectors.toList());
		
		
	
	}

	public static Integer countXs(String xString) {

		return (int) xString.chars().filter(ch -> ch == 'o').count();

	}

	public static Integer addEven(String string) {

		return string.chars().mapToObj(c -> Character.toString(c)).mapToInt(num -> Integer.parseInt(num))
				.filter(i -> i % 2 == 0).sum();

	}

	public static Double getAverage(int[] numbers) {

		return Arrays.stream(numbers).average().getAsDouble();
		
	}

	public static Integer countOccurrences(String[] strArr, String string) {

		return (int) Arrays.stream(strArr).filter(word -> word.equals(string)).count();
		
	}

}
