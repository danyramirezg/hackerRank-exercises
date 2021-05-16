package com.dany.hackerrankexercises.daysOfCode30

/*
  Task
  Given a base-10 integer, n, convert it to binary (base-2). Then find and print the base-10 integer
  denoting the maximum number of consecutive 1's in n's binary representation. When working with
  different bases, it is common to show the base as a subscript.

  Example:
  n = 125

  The binary representation of 125 base 10 is 1111101. In base 10, there are 5 and 1 consecutive
  ones in two groups. Print the maximum, 5.

  Input: 5
  Output: 1

  Input: 13
  Output: 2

  Explanation:

  Sample Case 1:
  The binary representation of 5 is 101, so the maximum number of consecutive 1's is .

  Sample Case 2:
  The binary representation of 13 is 1101, so the maximum number of consecutive 1's is 2.

 */

import kotlin.math.max

fun main(args: Array<String>) {

  var number = readLine()!!.trim().toInt()
  var current = 0
  var maxValue = 0

  while (number > 0) {
    val remainder = number % 2
    if (remainder == 1) {
      current += 1
      if (current > maxValue) {
        maxValue = current
      }
    } else {
      current = 0
    }
    number /= 2
  }
  println(maxValue)
}




