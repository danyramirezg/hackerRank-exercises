package com.dany.hackerrankexercises.daysOfCode30

/*
Task
Write a Person class with an instance variable, age, and a constructor that takes an integer,
initialAge, as a parameter. The constructor must assign initialAge to  after confirming the argument
passed as initialAge is not negative; if a negative argument is passed as initialAge, the
constructor should set age to 0 and print Age is not valid, setting age to 0.. In addition, you must
write the following instance methods:

yearPasses() should increase the age instance variable by 1.
amIOld() should perform the following conditional actions:
If age < 13, print You are young..
If age >= 13 and age < 18, print You are a teenager..
Otherwise, print You are old..

 */

class Person(age: Int) {

    var age: Int

    init {
        this.age = age
        if (age < 0) {
            println("Age is not valid, setting age to 0.")
            this.age = 0
        }
    }

    fun amIOld() {
        if (age < 13)
            println("You are young.")
        else if (age in 13..17)
            println("You are a teenager.")
        else
            println("You are old.")
    }

    fun yearPasses() {
        this.age += 1
    }
}

fun main(args: Array<String>) {
    val t = readLine()?.toInt()

    for (i in 0..t!!) {
        val age = readLine()?.toInt()
        val p = age?.let { Person(it) }
        p?.amIOld()
        for (j in 0..3) {
            p?.yearPasses()
        }
        p?.amIOld()
        println("")
    }
}