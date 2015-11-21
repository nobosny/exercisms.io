/**
 * Created by Nobosny on 11/21/2015.
 */
public class PhoneNumber {
    private String _cleanedNumber;
    private final String INVALID_NUMBER = "0000000000";

    public PhoneNumber(String number) {
        _cleanedNumber = "";
        int i = 0;
        while(i < number.length()) {
            char letter = number.charAt(i);
            if (Character.getType(letter) == Character.DECIMAL_DIGIT_NUMBER) {
                _cleanedNumber += letter;
            }
            i++;
        }
    }

    public String getNumber(){
        if (_cleanedNumber.length() == 11) {
            if (_cleanedNumber.charAt(0) == '1') {
                return _cleanedNumber.substring(1);
            } else {
                return INVALID_NUMBER;
            }
        }

        if (_cleanedNumber.length() < 10) {
            return INVALID_NUMBER;
        }

        return _cleanedNumber;
    }

    public String getAreaCode() {
        return getNumber().substring(0, 3);
    }

    public String pretty() {
        String number = getNumber();
        return "(" + getAreaCode() + ") " + number.substring(3, 6) + "-" + number.substring(6,10);
    }
}
