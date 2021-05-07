package com.dany.hackerrankexercises.daysOfCode30

/*
    Task
    Given an integer, n, perform the following conditional actions:

    If  is odd, print Weird
    If  is even and in the inclusive range of 2 to 5, print Not Weird
    If  is even and in the inclusive range of 6 to 20, print Weird
    If  is even and greater than 20, print Not Weird
    Complete the stub code provided in your editor to print whether or not n is weird.

 */

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    if (n % 2 == 0) {
        if (n in 2..5 || n > 20) {
            println("Not Weird")
        } else {
            println("Weird")
        }
    } else {
        println("Weird")
    }
}