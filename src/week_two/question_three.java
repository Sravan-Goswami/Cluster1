package week_two;

import java.util.*;

public class question_three {

	 // Function to check if dictionary word is a valid step word
    public static boolean isStepWord(String base, String dictWord) {
        if (dictWord.length() != base.length() + 1) return false;

        int[] freqBase = new int[26];
        int[] freqDict = new int[26];

        for (char c : base.toCharArray()) {
            freqBase[c - 'a']++;
        }
        for (char c : dictWord.toCharArray()) {
            freqDict[c - 'a']++;
        }

        // Check condition: dictWord should have exactly one extra character
        int diffCount = 0;
        for (int i = 0; i < 26; i++) {
            if (freqDict[i] < freqBase[i]) {
                return false; // missing character from base
            }
            diffCount += freqDict[i] - freqBase[i];
            if (diffCount > 1) return false;
        }

        return diffCount == 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input word
        String baseWord = sc.nextLine().trim().toLowerCase();

        // Dictionary size
        int n = Integer.parseInt(sc.nextLine().trim());
        List<String> dictionary = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            dictionary.add(sc.nextLine().trim().toLowerCase());
        }

        // Collect valid step words
        List<String> result = new ArrayList<>();
        for (String word : dictionary) {
            if (isStepWord(baseWord, word)) {
                result.add(word);
            }
        }

        // Print in lexicographical order
        Collections.sort(result);
        for (String w : result) {
            System.out.println(w);
        }

    }

}
