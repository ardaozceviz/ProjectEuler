/*
By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/

fun main(args: Array<String>) {
    println(nThPrime(10001))
}

fun nThPrime(limit: Int): Int{
    var counter = 0
    var number = 0
    while (true){
        number++
        if (isItPrime(number)) counter++
        if (counter == limit) {
            return number
        }
    }
}

fun isItPrime(i: Int): Boolean {
    if (i <= 1) return false
    if (i == 2) return true
    for (j in 2 until i) {
        if (i % j == 0) return false
    }
    return true
}