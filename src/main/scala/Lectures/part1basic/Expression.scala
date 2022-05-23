package Lectures.part1basic

object Expression extends App {
  val x = 1 + 2; // 1+ 2 is an expression
  println(x)
  println(2 + 3 * 4)
  //+ - */& |  << >> >>>(right shift with zero extension)

  println(1 == x)
  //== != > >= < <=
  var aVariable = 2
  aVariable += 3 //also works with -= *= /= .... side effects
  println(aVariable)

  //instruction (tell computer to do) versus expression (value)

  //if expression
  val aCondition = true
  val aConditionedValue = if (aCondition) 5 else 3 // if is expression not  instruction
  println(aConditionedValue)

  //while and loop in general is very specific to imperative programming(java, python, c)
  //scala focus everything to expression, only val, class and package is not expressions

  val aWeiredValue = (aVariable = 3) //unit === void
  println(aWeiredValue) //resign cause side effect return unit ()

  //side effects: println(), whiles, reassigning
  //code block surrounded by curly brace, it is an expression,value of the block is the value of last line of code
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye"

  }

  //expression is give me the value of something


}
