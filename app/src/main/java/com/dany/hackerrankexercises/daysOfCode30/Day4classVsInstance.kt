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

class Person(age: Int){

    var age: Int = 0

    init{
        this.age = age
    }

    fun amIOld(){
        if (age > 18)
            println("You are old.")
    }


}