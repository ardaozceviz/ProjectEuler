/*
The sum of the squares of the first ten natural numbers is,
1^2 + 2^2 + ... + 10^2 = 385

The square of the sum of the first ten natural numbers is,
(1 + 2 + ... + 10)^2 = 552 = 3025

Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is
3025 − 385 = 2640.

Find the difference between the sum of the squares of the first one hundred natural numbers and the square of the sum.
 */

fun main(args: Array<String>) {
    val limit = 100
    val numbers = (1..limit).toList()
    println(difference(numbers))
}

fun difference(numbers: List<Int>): Int {
    val squares = numbers.map { Math.pow(it.toDouble(), 2.0).toInt() }
    val sum = squares.sum()
    val squareOfTheSum = Math.pow(numbers.sum().toDouble(), 2.0).toInt()
    return squareOfTheSum - sum
}
