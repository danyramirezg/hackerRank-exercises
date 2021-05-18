package com.dany.hackerrankexercises.daysOfCode30

fun main(args: Array<String>) {

  val arr = Array<Array<Int>>(6, { Array<Int>(6, { 0 }) })

  for (i in 0 until 6) {
    arr[i] = readLine()!!.trimEnd().split(" ").map { it.toInt() }.toTypedArray()
  }

  var max_hourglass_sum = -63
  for (i in 1..5) {
    for (j in 1..5) {
      var current_hourglass_sum = get_hourglass_sum(arr, i, j)
      if (current_hourglass_sum > max_hourglass_sum) {
        max_hourglass_sum = current_hourglass_sum
      }
    }
  }
  println(max_hourglass_sum)

  fun get_hourglass_sum(matrix: Int, row: Int, col: Int) {
    val sum:
    //sum += matrix[row -1][col -1]

  }


}