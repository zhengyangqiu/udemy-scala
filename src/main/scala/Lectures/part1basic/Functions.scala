package Lectures.part1basic

object Functions extends App {
  def aFunction(a: String, b: Int): String = (
    a + " " + b
    )

  println(aFunction("hello", 3))

  def aParameterlessFunction: Int = 42

  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n: Int): String = {
    if (n == 1) aString
    else aString + aRepeatedFunction(aString, n - 1)
  }

  println(aRepeatedFunction("hello", 3))
  //WHEN NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String): Unit = println(aString)
  //auxiliary function

  def aBigFunction(n: Int): Int = {
    def aSmallerFunction(a: Int, b: Int): Int = a + b

    aSmallerFunction(n, n - 1)

  }

  def greeting(name: String, age: Int): String = {
    s"Hi, my name is $name and i am $age years old."
  }

  println(greeting("yang", 25))

  def factorial(n: Int): Int = {
    if (n == 1) 1
    else n * factorial(n - 1)
  }

  println(factorial(4))

  def fibonacci(n: Int): Int =
    if (n <= 2) 1
    else fibonacci(n - 1) + fibonacci(n - 2)
  //1 1 2 3 5 8 13 21

  println(fibonacci(8))


  def isPrime(n: Int): Boolean = {
    def isPrimeUntil(t: Int): Boolean =
      if (t <= 1) true
      else n % t != 0 && isPrimeUntil(t - 1)

    isPrimeUntil(n / 2)
  }

  println(isPrime(6))

}
