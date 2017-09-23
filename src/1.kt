fun main(args: Array<String>) {
    // If we list all the natural numbers below 10 that are multiples of 3 or 5, we get 3, 5, 6 and 9. The sum of these multiples is 23. Find the sum of all the multiples of 3 or 5 below 1000.

    var numbers = arrayListOf<Int>()
    var number = 1
    var total = 0

    while (number in 1..999) {
        if (number % 3 == 0 || number % 5 == 0) {
            numbers.add(number)
        }
        number++
    }

    for (num in numbers) {
        total += num
    }
    println(total)
}