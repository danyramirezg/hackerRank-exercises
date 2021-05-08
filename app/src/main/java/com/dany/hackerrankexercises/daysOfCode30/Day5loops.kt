package com.dany.hackerrankexercises.daysOfCode30

/*
Task
Given an integer, n, print its first  multiples. Each multiple n x i (where i <= i <= 10) should be
printed on a new line in the form: n x i = result.

Example:
n = 3
The printout should look like this:

3 x 1 = 3
3 x 2 = 6
3 x 3 = 9
3 x 4 = 12
3 x 5 = 15
3 x 6 = 18
3 x 7 = 21
3 x 8 = 24
3 x 9 = 27
3 x 10 = 30
 */

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    for (i in 1..10) {
        println("$n x $i = ${n * i}")
    }
}