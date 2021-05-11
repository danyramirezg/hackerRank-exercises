package com.dany.hackerrankexercises.daysOfCode30

/*
    Task
    Given an array, A, of N integers, print A's elements in reverse order as a single line of
    space-separated numbers.

    Example:

    A = [1, 2, 3, 4]

    Print 4 3 2 1. Each integer is separated by one space.

    Input Format

    The first line contains an integer, N (the size of our array).
    The second line contains N space-separated integers that describe array 's elements

    Sample Input:
    4
    1 4 3 2

    Sample Output:
    2 3 4 1

 */

fun main(args: Array<String>) {
    val n = readLine()!!.trim().toInt()

    val arr = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
    reverseArray(arr)
    printArray(n, arr)
}

fun reverseArray(arr: Array<Int>) {

    var temp: Int
    var start = 0
    var end: Int = n - 1

    while (start < end) {
        temp = arr[start]
        arr[start] = arr[end]
        arr[end] = temp
        start++
        end--
    }
}

fun printArray(size: Int, arr: Array<Int>) {
    for (i in 0 until size) {
        print("${arr[i]} ")
    }
}
