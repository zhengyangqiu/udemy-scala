package Lectures.part1basics

object CBNvsCBV extends App{
  def calledByValue(x:Long):Unit = {
    println("by value: " + x)
    println("by value: " + x)
  }
  def calledByName(x: =>Long): Unit={
    println("by name " + x)
    println("by name " + x)

  }
  calledByValue(System.nanoTime())
  //in the by value call, the exact value of this expression is
  // computed before the function evaluates in the same value is used in the function definition
  calledByName(System.nanoTime())
  //system.nanotime is the replacement of x throughout the entire function definition
  //=>delays the evaluation of the expression passed as a parameter and it's used literally every time it's used in
  // the function definition

  def infinite():Int = 1 + infinite()
  def printlnFirst(x: Int, y : => Int) = println(x)
//  printlnFirst(infinite(),34)
  printlnFirst(34,infinite())
  //parameter y is not used

  //call by value: value is computed before call, same value used everywhere
  //call by name: expression is passed literally and expression is evaluated at every use within






}
