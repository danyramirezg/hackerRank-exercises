package com.dany.hackerrankexercises.daysOfCode30

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




