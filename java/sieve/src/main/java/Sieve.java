import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;

/**
 * Created by Nobosny on 11/21/2015.
 * @author Nobosny
 */
public class Sieve {

    // List to store the list of number to be marked as prime or not
    private List<Integer> numberList;
    // Upper limit to find to primes
    private int _upperLimit;

    /**************************************************************************************************
     * Constructor to create a list storing starting from index 2, the numbers starting from 2 too
     *
     * @param upperLimit    Max number to search the primes below
     */
    public Sieve(int upperLimit) {
        // Store upperLimit as a private variable to be used class wide.
        this._upperLimit = upperLimit;
        // Initialization of the list of numbers
        numberList = new ArrayList<>();
        for (int i = 0; i <= _upperLimit; i++) {
            numberList.add(i, i);
        }
    }

    public List<Integer> getPrimes() {

        // Marking 0 and 1 as non-prime numbers
        numberList.set(0, 0);
        numberList.set(1, 0);

        // Iterating from 2 (the first prime) until the square of the index is less than the upper limit
        // This is used because of the property of the multiplication, 2 * 3 = 3 * 2
        for (int i = 2; i * i <= _upperLimit; i++) {
            // If the number at i isn't marked as a non-prime (is prime)
            if (numberList.get(i) != 0) {
                // Mark (set to zero) all the multiples of this number up to the upper limit
                for (int j = i; i * j <= _upperLimit; j++) {
                    numberList.set(i*j, 0);
                }
            }
        }

        // Remove all the zeros from the list, leaving just the primes below upperLimit
        numberList.removeIf(s -> s.equals(0));

        return numberList;
    }
}

    /*
    * Process finished with exit code 0 : All test passed!
    * */
