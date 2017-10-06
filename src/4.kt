import java.lang.Math.*

/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun isPalindrome(number: Int, digits: Int): Boolean {
    val numberMap = HashMap<Int, Int>()
    var myNumber = number
    var divider = pow(10.0, (digits - 1).toDouble()).toInt()
    var digitValue: Int

    //print("$myNumber = ")
    for (i in 1..digits) {
        digitValue = myNumber / divider
        // print("($digitValue x $divider)")
        numberMap.put(divider, digitValue)
        myNumber -= (digitValue * divider)
        divider /= 10
    }
    //println()
    return makeReverse(numberMap) == number
}

fun makeReverse(numberMap: HashMap<Int, Int>): Int {
    val numberOfDigits = numberMap.size
    val myKey = pow(10.0, (numberOfDigits - 1).toDouble()).toInt()
    var reverseNumber = 0
    var digit = 1
    var multiplier = myKey
    //println("$numberMap -> $numberOfDigits")

    while (digit in 1..myKey) {
        reverseNumber += numberMap[digit]!! * multiplier
        //println("${numberMap[digit]} -> $digit")
        //println("${numberMap[digit]} -> $multiplier")
        digit *= 10
        multiplier /= 10
    }
    return reverseNumber
}

fun digitFinder(number: Int): Int {
    var divider = 10
    var numberOfDigits = 1
    while (number / divider >= 1) {
        divider *= 10
        numberOfDigits++
    }
    return numberOfDigits
}

fun main(args: Array<String>) {
    val baseNumber = 999
    var numberOne = baseNumber
    var numberTwo = baseNumber

    while (numberOne >= 1) {
        stop@ while (numberTwo >= numberOne) {
            val myNumber = numberOne * numberTwo
            val numberOfDigits = digitFinder(myNumber)
            if (isPalindrome(myNumber, numberOfDigits)) {
                println("$myNumber = $numberTwo x $numberOne")
                break@stop
            }
            numberTwo--
        }
        numberOne--
        numberTwo = baseNumber
    }

}
