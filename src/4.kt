/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */

fun main(args: Array<String>) {
    var store = arrayListOf<Int>()
    var numberOne = 9
    var numberTwo = 9

    while (numberOne >= 1) {
        while (numberTwo >= numberOne) {
            println(numberOne * numberTwo)
            numberTwo--
        }
        numberOne--
        numberTwo = 9
    }
}