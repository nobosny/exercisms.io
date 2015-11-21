import java.util.HashMap;
import java.util.Map;

public class WordCount {
    public Map<String, Integer> Phrase(String phrase) {
        HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();

        int i = 0;
        String word = "";
        while (i < phrase.length()) {
            char letter = phrase.charAt(i);
            if ((letter == ' ') && (!word.isEmpty())) {
                wordFreq.put(word.toLowerCase(), wordFreq.getOrDefault(word.toLowerCase(), 0) + 1);
                word = "";
            } else {
                if ((Character.getType(letter) == Character.LOWERCASE_LETTER) ||
                    (Character.getType(letter) == Character.UPPERCASE_LETTER) ||
                    (Character.getType(letter) == Character.DECIMAL_DIGIT_NUMBER)) {
                    word += letter;
                }
            }
            i++;
        }

        if (!word.isEmpty()) {
            wordFreq.put(word.toLowerCase(), wordFreq.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        return wordFreq;
    }
}
