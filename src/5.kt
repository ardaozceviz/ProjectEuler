/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

fun main(args: Array<String>) {
    println(okek(20))
}

fun okek(limit: Int): Int{
    var result = multiplyPrimeNumbers(limit)
    for (i in limit downTo 2) {
        while (result % i != 0) {
            result *= biggestPrimeFactor(i)
        }
    }
    return result
}

fun biggestPrimeFactor(i: Int): Int {
    val result = i
    for (j in i - 1 downTo 2) {
        if (result % j == 0 && isPrime(j)) {
            return j
        }
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
    if (i <= 1) {
        return false
    }
    if (i == 2) {
        return true
    }
    for (j in 2 until i) {
        if (i % j == 0) {
            return false
        }
    }
    return true
}

fun multiplyPrimeNumbers(limit: Int): Int {
    var value = 1
    val primeNumbers = findPrimes(limit)
    for (number in primeNumbers) {
        value *= number
    }
    return value
}