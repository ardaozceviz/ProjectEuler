/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

fun main(args: Array<String>) {

    var divider = 2
    var number = 80
    var counter = 0
    val numberMap = hashMapOf<Int, Int>()
    while (number % divider == 0) {
        counter++
        if (number / divider != 1) {
            number /= divider
        } else {
            numberMap.put(divider, counter)
            break
        }
        numberMap.put(divider, counter)
        while (number % divider != 0) {
            divider++
            counter = 0
        }
    }
    println(numberMap)
}