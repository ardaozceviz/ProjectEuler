import java.lang.Math.*

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun ifPalindrome(number: Int, digits: Int): Boolean {
    var numberMap = hashMapOf<Int, Int>()
    var myNumber = number
    var divider = pow(10.0, (digits - 1).toDouble()).toInt()
    var digitValue: Int

    print("$myNumber = ")
    for (i in 1..digits) {
        digitValue = myNumber / divider
        print("($digitValue x $divider)")
        numberMap.put(divider, digitValue)
        myNumber -= (digitValue * divider)
        divider /= 10
    }

    println()

    return true
}

fun main(args: Array<String>) {
    val baseNumber = 99
    var numberOne = baseNumber
    var numberTwo = baseNumber
    var divider = 10
    var numberOfDigits = 1

    while (numberOne >= 1) {
        while (numberTwo >= numberOne) {
            var myNumber = numberOne * numberTwo
            while (myNumber / divider >= 1) {
                divider *= 10
                numberOfDigits++
            }
            ifPalindrome(myNumber, numberOfDigits)
            numberOfDigits = 1
            divider = 10
            numberTwo--
        }
        numberTwo = baseNumber
        numberOne--
    }

}
