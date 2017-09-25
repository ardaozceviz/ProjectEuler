/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

fun main(args: Array<String>) {
    var number = 600851475143
    var divider = 2

    while (divider in 2..number) {
        if (number % divider == 0L) {
            number /= divider
            println(divider)
        } else {
            divider++
        }
    }
}
