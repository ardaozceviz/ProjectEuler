/*
The prime factors of 13195 are 5, 7, 13 and 29.
What is the largest prime factor of the number 600851475143 ?
*/

var primeFactors = arrayListOf<Long>()
var factors = arrayListOf<Long>()
var notPrimeFactors = arrayListOf<Long>()

fun main(args: Array<String>) {
    var number = 13195L
    //var number = 600851475143L

    findFactors(number)
    println(factors)
    findPrimeFactors(factors)
    println(primeFactors)
    println(primeFactors.last())

}

fun findFactors(number: Long) {
    factors.clear()
    var counter = 2L
    while (counter in 2..number) {
        if (number % counter == 0L) {
            factors.add(counter)
        }
        counter++
    }
}

fun findPrimeFactors(factors: ArrayList<Long>){
    primeFactors.clear()
    var divider: Long
    var position = 0
    var amountOfNumbers = factors.size

    while (position in 0 until amountOfNumbers){
        var numberInProcess = factors[position]
        divider  = 2L
        while (divider in 2 until numberInProcess) {
            if (numberInProcess % divider == 0L) {
                if (!notPrimeFactors.contains(numberInProcess)){
                    notPrimeFactors.add(numberInProcess)
                }
            }
            divider++
        }
        position++
    }
    primeFactors.addAll(factors.subtract(notPrimeFactors))
}
