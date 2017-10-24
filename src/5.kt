/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

fun main(args: Array<String>) {
    println("%.0f".format(okek(20)))
}

fun okek(limit: Int): Double {
    val list = findPrimes(limit)
    var result = 1.0
    var counter = 0
    for (divider in list) {
        var number = limit
        while (true) {
            if (number < divider) break
            number /= divider
            counter++
        }
        result *= Math.pow(divider.toDouble(), counter.toDouble())
        counter = 0
    }
    return result
}

fun findPrimes(i: Int): List<Int> {
    val primeNumbers = arrayListOf<Int>()

    for (j in 2..i) {
        if (isPrime(j)) {
            primeNumbers.add(j)
        }
    }
    return primeNumbers
}

fun isPrime(i: Int): Boolean {
    if (i <= 1) return false
    if (i == 2) return true
    for (j in 2 until i) {
        if (i % j == 0) return false
    }
    return true
}











