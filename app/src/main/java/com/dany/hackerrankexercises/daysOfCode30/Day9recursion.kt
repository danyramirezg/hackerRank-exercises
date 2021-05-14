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
    // 3 + 2 + summation (2-1)
    // 3 + 2 + 1 + summation (1-1)
    // 3 + 2 + 1 + 0 = 6
    return n + summation(n - 1)
  }
}

// 4! = 4 * 3 * 2 * 1
fun factorial(n: Int): Int {

  // Base case:
  if (n <= 1) {
    return 1
  }
  // Recursive case
  else {
    // 4 * factorial(4 -1)
    // 4 * 3 * factorial(3 - 1)
    // 4 * 3 * 2 * factorial(2 -1)
    // 4 * 3 * 2 * 1
    return (n * factorial(n - 1))
  }
}

// 2^3 = 2 * 2 * 2
fun exponentiation(n: Int, p: Int): Int {

  if (p <= 0) {
    return 1
  } else {
    return n * exponentiation(n, p - 1)
    // 2 * exponentiation(2, 2)
    // 2 * 2 * exponentiation(2, 1)
    // 2 * 2 * 2 * exponentiation(2, 0)
    // 2 * 2 * 2 * 1
  }

}

fun main(args: Array<String>) {
  val n = readLine()!!.trim().toInt()
  val p = readLine()!!.trim().toInt()


  val result = factorial(n)

  val sum = summation(n)

  val expon = exponentiation(n, p)

  println("The factorial of $n is: $result")
  println("The summation of the $n is $sum")
  println("$n elevado al $p es $expon")
}
