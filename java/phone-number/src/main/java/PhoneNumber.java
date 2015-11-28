/**
 * Created by Nobosny on 11/21/2015.
 */
public class PhoneNumber {

    // String to store the cleaned number
    private String _cleanedNumber;

    // Constant storing an invalid number
    private final String INVALID_NUMBER = "0000000000";

    /**
     * Constructor taking a number as a string and validating and cleaning leaving just the numbers
     * @param number String representing a phone number
     */
    public PhoneNumber(String number) {
        // Initialization of the parameters
        _cleanedNumber = "";
        int i = 0;
        // While the end of the string isn't reached
        while(i < number.length()) {
            // Get the character at position i
            char letter = number.charAt(i);
            // If this character is a number, add it to the cleaned number string
            if (Character.getType(letter) == Character.DECIMAL_DIGIT_NUMBER) {
                _cleanedNumber += letter;
            }
            // If isn't a number, just ignore it
            i++;
        }
    }

    /**
     * Getter for the cleaned and validated phone number
     * @return Clean and valid phone number
     */
    public String getNumber(){
        // If the size of the number is 11...
        if (_cleanedNumber.length() == 11) {
            // And starts with '1'...
            if (_cleanedNumber.charAt(0) == '1') {
                // Return it without the first position (the '1')
                return _cleanedNumber.substring(1);
            } else {
                // Else return the string representation of an invalid number
                return INVALID_NUMBER;
            }
        } else {
            // If the size of the number is less than 10
            if (_cleanedNumber.length() == 10) {
                return _cleanedNumber;
            } else {
                // Return invalid in any other case
                return INVALID_NUMBER;
            }
        }
    }

    /**
     * Get the area code of the phone number
     * @return Three digits area code
     */
    public String getAreaCode() {
        // Get a valid phone number and take the first three characters which represents the area code
        return getNumber().substring(0, 3);
    }

    /**
     * Prettify the phone number formatting it like (###) ###-####
     * @return The phone number formatted as a human readable form
     */
    public String pretty() {
        // Get the valid number
        String number = getNumber();
        //Return a formatted string
        return "(" + getAreaCode() + ") " + number.substring(3, 6) + "-" + number.substring(6,10);
    }
}

/*
* Process finished with exit code 0: All test passed!
* */
