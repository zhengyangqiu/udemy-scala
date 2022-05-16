package Lectures.part1basics

object Functions extends App{
  def aFunction(a:String, b: Int):String = (
    a + " " + b
    )
  println(aFunction("hello",3))

  def aParameterlessFunction: Int = 42
  println(aParameterlessFunction)

  def aRepeatedFunction(aString: String, n:Int): String = {
    if (n==1) aString
    else aString + aRepeatedFunction(aString, n-1)
  }
  println(aRepeatedFunction("hello",3))
  //WHEN NEED LOOPS, USE RECURSION

  def aFunctionWithSideEffects(aString: String) : Unit= println(aString)
  //auxiliary function

  def aBigFunction(n:Int): Int = {
    def aSmallerFunction(a:Int,b:Int):Int = a + b
    aSmallerFunction(n,n-1)

  }

  def greeting(name:String, age:Int) :String={
    s"Hi, my name is $name and i am $age years old."
  }

  println(greeting("yang",25))

  def factorial(n:Int):Int={
    if (n==1) 1
    else n*factorial(n-1)
  }
  println(factorial(4))

  def fibonacci(n:Int):Int=
    if (n <= 2) 1
    else fibonacci(n-1) + fibonacci(n-2)
    //1 1 2 3 5 8 13 21

  println(fibonacci(8))


  def isPrime(n:Int) :Boolean={
    def isPrimeUntil(t:Int): Boolean =
      if(t<=1) true
      else n%t!= 0 && isPrimeUntil(t-1)

    isPrimeUntil(n/2)
  }

  println(isPrime(6))

}


//That said, let me explain the recursion there. We have
//
//factorial(n) = if(n <= 0) 1 else n * factorial(n-1)
//so for your case factorial(5) is
//
//factorial(5) = if (5 <= 0) 1 else 5 * factorial(4) = 5 * factorial(4)
//so you have to evaluate factorial(4) first:
//
//factorial(4) = if (4 <= 0) 1 else 4 * factorial(3) = 4 * factorial(3)
//so you have to evaluate factorial(3) first:
//
//factorial(3) = if (3 <= 0) 1 else 3 * factorial(2) = 3 * factorial(2)
//so you have to evaluate factorial(2) first:
//
//factorial(2) = if (2 <= 0) 1 else 2 * factorial(1) = 2 * factorial(1)
//so you have to evaluate factorial(1) first:
//
//factorial(1) = if (1 <= 0) 1 else 1 * factorial(0) = 1 * factorial(0)
//so you have to evaluate factorial(0) first:
//
//factorial(0) = if (0 <= 0) 1 else 0 * factorial(-1) = 1
//so you then have to work your way back up and compute the intermediate results up to factorial(5):
//
//factorial(1) = 1 * factorial(0) = 1 * 1 = 1
//factorial(2) = 2 * factorial(1) = 2 * 1 = 2
//factorial(3) = 3 * factorial(2) = 3 * 2 = 6
//factorial(4) = 4 * factorial(3) = 4 * 6 = 24
//factorial(5) = 5 * factorial(4) = 5 * 24 = 120