/*
A palindromic number reads the same both ways. The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
Find the largest palindrome made from the product of two 3-digit numbers.
 */
fun main(args: Array<String>) {
    val store = arrayListOf<Int>()
    var numberOne = 9
    var numberTwo = 9
    val resetNumberTwo = numberTwo

    while (numberOne >= 1) {
        while (numberTwo >= numberOne) {
            store.add(numberOne * numberTwo)
            numberTwo--
        }
        numberOne--
        numberTwo = resetNumberTwo
    }
    println(store)
}
