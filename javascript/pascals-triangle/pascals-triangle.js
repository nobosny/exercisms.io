var Triangle = function (rowNumber) {

    var pascalsT = [[1]];
    var level;

    for (var j = 0; j < rowNumber - 1; j++) {
        level = [1];
        for (var k = 1; k < pascalsT[j].length; k++) {
            level[k] = pascalsT[j][k] + pascalsT[j][k - 1];
        }
        level.push(1);
        pascalsT.push(level);
    }

    this.rows = pascalsT;

    this.lastRow = pascalsT[rowNumber-1];

};

module.exports = Triangle;