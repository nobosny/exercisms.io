import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class WordCount {

    /*************************************************************************************************************
    * Count the occurrences of each word of a given phrase
    * I used this solution because in the documentation of StringTokenizer I found:
    *
    * "StringTokenizer is a legacy class that is retained for compatibility reasons although its use is discouraged
    * in new code. It is recommended that anyone seeking this functionality use the split method of String or the
    * java.util.regex package instead."
    *
    * @param    phrase  Phrase to count the words
    * @return           Map<String, Integer> where the keys are the words and the values are the count of each word
    */

    public Map<String, Integer> Phrase1(String phrase) {
        // HashMap to store the keys (words) and values (words count) to be returned
        HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();

        // Params initialization
        int i = 0;
        String word = "";

        // While the end of the phrase is not reached
        while (i < phrase.length()) {

            // Get the character at i position
            char letter = phrase.charAt(i);

            // If this letter is the separator and the word stored isn't empty
            if ((letter == ' ') && (!word.isEmpty())) {
                // Add the word to the map of words adding 1 to the value already stored in that key
                // 0 if is not defined, meaning that this is the first occurrence of that word and adding 1
                wordFreq.put(word.toLowerCase(), wordFreq.getOrDefault(word.toLowerCase(), 0) + 1);
                // Clear the word
                word = "";
            } else {
                // The letter is the separator (space) or the word is empty
                // If the letter is a lowercase or an uppercase or a number
                if ((Character.getType(letter) == Character.LOWERCASE_LETTER) ||
                    (Character.getType(letter) == Character.UPPERCASE_LETTER) ||
                    (Character.getType(letter) == Character.DECIMAL_DIGIT_NUMBER)) {
                    // Sum it to the word
                    word += letter;
                    // Any other character than these three types are ignored
                }
            }
            //Go to the next position to analyse in the phrase
            i++;
        }

        // If the end of the phrase is reached but the word isn't empty, means that the phrase ends in a valid word, so
        if (!word.isEmpty()) {
            // Add one to the count of that word
            wordFreq.put(word.toLowerCase(), wordFreq.getOrDefault(word.toLowerCase(), 0) + 1);
        }

        // Return the Map containing the keys and values of the words and the occurrence of them in the phrase
        return wordFreq;
    }
    /*
    * Process finished with exit code 0 : All test passed!
    * */




    /*****************************************************************************************************************
    * Count the occurrences of each word of a given phrase
    *
    * @param    phrase  Phrase to count the words
    * @return           Map<String, Integer> where the keys are the words and the values are the count of each word
    */

    public Map<String, Integer> Phrase (String phrase) {
        // HashMap to store the keys (words) and values (words count) to be returned
        HashMap<String, Integer> wordFreq = new HashMap<String, Integer>();

        // Tokenize the phrase using an instance of the class StringTokenizer
        // Can be replaced for the use of split()
        StringTokenizer st = new StringTokenizer(phrase);
        //While the tokenizer has more tokens using the default separator (space)
        while (st.hasMoreTokens()) {
            // Clean the token in lowercase and set the pointer to return the next token (nextToken())
            String word = cleanString(st.nextToken().toLowerCase());
            // If the word is not empty
            if (!word.isEmpty()) {
                // Add 1 to the count of this word into the map
                wordFreq.put(word, wordFreq.getOrDefault(word, 0) + 1);
            }
        }

        return wordFreq;
    }
    /*
    * Process finished with exit code 0 : All test passed!
    * */


    /******************************************************************
     * Private function used to clean a string from characters different from lowercase or numbers
     *
     * @param   dirtyWord   The string to be cleaned
     * @return              Cleaned string containing just lowercase letters or numbers, or the empty string
    */
    private String cleanString(String dirtyWord) {
        String cleanedString = "";

        for (int i = 0; i < dirtyWord.length(); i++) {
            // Get the char in the i position
            char letter = dirtyWord.charAt(i);
            // If the letter is a lowercase or or a number
            if ((Character.getType(letter) == Character.LOWERCASE_LETTER) ||
                    (Character.getType(letter) == Character.DECIMAL_DIGIT_NUMBER)) {
                // Sum it to the word
                cleanedString += letter;
            }
            // Any other character than these three types are ignored
        }

        // return the string cleaned
        return cleanedString;
    }
}
