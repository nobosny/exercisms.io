var Queens = function () {
    this.white = [0, 3];
    this.black = [7, 3];

    for (var n in arguments[0]) { this[n] = arguments[0][n]; }

    if (this.white == this.black) {
        throw (new Error('Queens cannot share the same space'));
    }
};

Queens.prototype.toString = function qToString() {
    var board = '';

    for (var i = 0; i < 8; i++) {
        for (var j = 0; j < 8; j++) {
            if ((this.white[0] == i) && (this.white[1] == j)) {
                board += 'W ';
            } else {
                if ((this.black[0] == i) && (this.black[1] == j)) {
                    board += 'B ';
                } else {
                    board += '_ ';
                }
            }            
        }
        board = board.trim();
        board += '\n';
    }

    return board;
};

Queens.prototype.canAttack = function () {
    return (Math.abs(this.white[0] - this.black[0]) == 0)
        || (Math.abs(this.white[1] - this.black[1]) == 0)
        || (Math.abs(this.white[0] - this.black[0]) == Math.abs(this.white[1] - this.black[1]));
};

module.exports = Queens;