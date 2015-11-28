/*
If all the lower primes of a number n are known, and none of them divide 
into n without a remainder, then n is also prime.

That's how I found the nth prime, storing all the lower primes until I find the nth-prime, and then, pop the last.
*/

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