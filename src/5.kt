/*
2520 is the smallest number that can be divided by each of the numbers from 1 to 10 without any remainder.
What is the smallest positive number that is evenly divisible by all of the numbers from 1 to 20?
*/

fun main(args: Array<String>) {

    val dividers = (1..10).toList()
    var myNumber = 1

    for (divider in dividers) {
        if(myNumber % divider != 0) {
            for (innerDivider in dividers){
                while (myNumber % innerDivider != 0){
                    myNumber++
                }
            }
        }
        println(myNumber)
    }


}