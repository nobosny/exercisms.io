/*
Yes, all the tests passed.

This code works pushing to a stack the open token found and pop it out as a closing token is found.
If these two (the open sign just poped and the close sign found it in the string) matched, then continue to the next
If not, is false

in the case of the string "{[}]": Balanced but not properly nested
'{' is added because is an open sign
'[' is added because is an open sign
'}' found in the string
   pop the last item from the stack because a closing token was found ('}') 
   but '[' (the last added to the stack) doesn't match with the closing token found '}', so, false is returned

The algorithm doesn't continue, just return false

How two tokens (open and close tokens) match
There're two arrays containing in the same index the closing and the opening tokens
If the index of a token from the "open" array is equal to the index of a token from the "close" array, 
then, these two tokens match

*/

var bracket = function (input) {

    var open = ['{', '[', '('];
    var close = ['}', ']', ')'];

    var stack = [];

    for (var i = 0; i < input.length; i++) {
        if (open.indexOf(input[i]) >= 0) {
            stack.push(input[i]);
        } else {
            if (close.indexOf(input[i]) != open.indexOf(stack.pop())) {
                return false;
            }
        }
    }

    if (stack.length > 0) {
        return false;
    }

    return true;
};

module.exports = bracket;