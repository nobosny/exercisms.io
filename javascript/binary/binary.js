var Binary = function (binStr) {
    this.binary = binStr;
};

Binary.prototype.toDecimal = function () {

    var decimal = 0;
    var power = 0;
    var invalid = false;

    while ((this.binary.length > 0) && (!invalid)) {
        var bit;
        if (this.binary[this.binary.length-1] == '0') {
            bit = 0;
        } else {
            if (this.binary[this.binary.length-1] == '1') {
                bit = 1;
            } else {
                invalid = true;
            }
        }

        if (!invalid) {
            decimal += bit * Math.pow(2, power++);
            this.binary = this.binary.substring(0, this.binary.length - 1);
        }
    }

    if (invalid) {
        return 0;
    } else {
        return decimal;
    }   

};

module.exports = Binary;