var Prime = function () { };

Prime.nth = function (nthPrime) {

    if (nthPrime == 0) {
        throw(new Error('Prime is not possible'));
    }

    var primes = [2];
    var p = 3; //

    while (primes.length < nthPrime) {
        var sqrtP = Math.sqrt(p);

        var i = 0;
        var stop = false;
        while ((primes[i] <= sqrtP) && (!stop)) {
            if ((p % primes[i]) != 0) {
                i++;
            } else {
                stop = true;
            }
        }

        if (!stop) {
            primes.push(p);
        }

        p = p + 2;

    }

    return primes.pop();
};

module.exports = Prime;