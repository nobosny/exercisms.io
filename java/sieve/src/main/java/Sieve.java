import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Nobosny on 11/21/2015.
 */
public class Sieve {

    private HashMap<Integer, Boolean> list;
    private int _upperLimit;

    public Sieve(int upperLimit) {
        this._upperLimit = upperLimit;
        list = new HashMap<>();
        for (int i = 2; i <= _upperLimit; i++) {
            list.put(i, true);
        }
    }

    public List<Integer> getPrimes() {

        List<Integer> result = new ArrayList<Integer>();

        for (int i = 2; i * i <= _upperLimit; i++) {
            if (list.get(i)) {
                for (int j = i; i * j <= _upperLimit; j++) {
                    list.put(i*j, false);
                }
            }
        }

        for (int i = 2; i <= _upperLimit; i++) {
            if (list.get(i)) {
                result.add(i);
            }
        }

        return result;
    }
}
