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