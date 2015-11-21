import java.util.HashMap;
import java.util.Map;

public class DNA {

    private String _dnaString;
    private HashMap<Character, Integer> _nucleotidesCount;

    public DNA(String dnaString) {
        this._dnaString = dnaString;

        _nucleotidesCount = new HashMap<>();
        _nucleotidesCount.put('A', 0);
        _nucleotidesCount.put('C', 0);
        _nucleotidesCount.put('G', 0);
        _nucleotidesCount.put('T', 0);

        for (int i = 0; i< _dnaString.length(); i++) {
            _nucleotidesCount.put(_dnaString.charAt(i), _nucleotidesCount.get(_dnaString.charAt(i)) + 1);
        }
    }

    public int count(char nucleotide) {
        if (_nucleotidesCount.get(nucleotide) == null) {
            throw new IllegalArgumentException();
        } else {
            return _nucleotidesCount.get(nucleotide);
        }
    }

    public Map<Character, Integer> nucleotideCounts() {
        return _nucleotidesCount;
    }
}
