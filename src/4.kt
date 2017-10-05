import java.lang.Math.*

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun ifPalindrome(number: Int, digits: Int): Boolean {
    var numberMap = hashMapOf<Int, Int>()
    var myNumber = number
    val numberOfDigits = digits - 1
    var divider = pow(10.0, numberOfDigits.toDouble()).toInt()
    var digitValue = 0

    while (myNumber != 0){
        digitValue = myNumber / divider
        print("($divider)$digitValue,")
        numberMap.put(divider,digitValue)
        myNumber -= (digitValue * divider)
        divider /= 10
    }
    //println(numberMap)
//    for((order,value) in numberMap){
//        if (numberMap[order] == numberMap[1] ){
//
//        }
//    }

    println()
    //println("$myNumber[$digits] -> $divider, $digitValue")

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
