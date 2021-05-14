package com.dany.hackerrankexercises.daysOfCode30

// Recursion

fun summation(n: Int): Int {

  // Base case: We are at the end:
  if (n <= 0) {
    return 0
  }
  //Recursive case: Keep going
  else {

    // 3 + summation (3-1)
    // 2 + summation (2-1)
    // 1 + summation (1-1)
    // 3 + 2 + 1 = 6
    return n + summation(n - 1)
  }
}

fun factorial(n: Int): Int {

  // Base case:
  if (n <= 1) {
    return 1
  }
  // Recursive case
  else {
    return (n * factorial( n - 1))
  }

}

fun main(args: Array<String>) {
  val n = readLine()!!.trim().toInt()

  val result = factorial(n)

  val sum = summation(n)

  println("The factorial of $n is: $result")
  println("The summation of the $n is $sum")
}
