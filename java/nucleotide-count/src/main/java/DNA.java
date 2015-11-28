import java.util.HashMap;
import java.util.Map;

/**
 * @author Nobosny
 */

public class DNA {

    // Map to store the Nucleotide and the count of occurrences in the DNA string
    private HashMap<Character, Integer> _nucleotidesCount;

    /**
     * Constructor taking the DNA string for parsing and store the nucleotides and its occurrences
     * It also validates the DNA string for any wrong nucleotide
     * @param dnaString The DNA string, a succession of nucleotides
     */
    public DNA(String dnaString) {
        // Initialization of the map
        _nucleotidesCount = new HashMap<>();
        // Pre storing the valid nucleotides and zero occurrences
        _nucleotidesCount.put('A', 0);
        _nucleotidesCount.put('C', 0);
        _nucleotidesCount.put('G', 0);
        _nucleotidesCount.put('T', 0);

        // Iterating through all the DNA string
        for (int i = 0; i< dnaString.length(); i++) {
            // If the nucleotide at i isn't in the map throw an exception
            if (_nucleotidesCount.get(dnaString.charAt(i)) == null) {
                throw new IllegalArgumentException("The DNA string is not valid.");
            } else {
                // Else, add one to the value already stored in the key (nucleotide)
                _nucleotidesCount.put(dnaString.charAt(i), _nucleotidesCount.get(dnaString.charAt(i)) + 1);
            }
        }
    }

    /**
     * Count the occurrence of a nucleotide in the DNA string
     * @param nucleotide    Character representing a nucleotide
     * @return              Occurrences of the nucleotide within the DNA string
     * @throws java.lang.IllegalArgumentException in case of a character that doesn't represent a valid DNA nucleotide
     */
    public int count(char nucleotide) {
        // If there isn't a value for the char throw an exception, which means that this char isn't a valid
        // DNA nucleotide
        if (_nucleotidesCount.get(nucleotide) == null) {
            throw new IllegalArgumentException();
        } else {
            // Else, return the count of this nucleotide
            return _nucleotidesCount.get(nucleotide);
        }
    }


    /**
     * Return a map containing as keys the valid nucleotides withing the DNA string and in the values, the occurrences
     * of each nucleotide
     * @return  A map containing the nucleotides (keys) and its occurrences (values).
     */
    public Map<Character, Integer> nucleotideCounts() {
        // Just return the private property already populated by the constructor
        return _nucleotidesCount;
    }
}

/*
Process finished with exit code 0: All tests passed!
 */
