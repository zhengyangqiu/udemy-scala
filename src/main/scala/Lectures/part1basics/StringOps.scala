package Lectures.part1basics

object StringOps extends App{
  val str: String = "Hello, I am Learning Scala"
  println(str.charAt(2))
  println(str.substring(7,11))
  println(str.split(" ").toList)
  println(str.startsWith("Hello"))
  println(str.replace(" ", "-"))
  println(str.toUpperCase)
  println(str.length())

  //Scala own utility
  val aNumberString = "45"
  val aNumber = aNumberString.toInt

  println('a'+:aNumberString :+ 'z')
  println(str.reverse)
  println(str.take(2))

  //Scala-specific: String interpolators
  //s-interpolators
  val name = "David"
  val age = 12
  val greeting = s"Hello, my name is $name and I am $age years old"
  val anotherGreeting = s"Hello, my name is $name and I will be turning ${age+1}years old."
  println(anotherGreeting)


  //f-interpolators
  val speed = 1.2f
  val myth=f"&name can eat $speed%2.2f burgers per minutes"
  //two characters total minimum and two decimals position
  //f is interpolated formatted string, $ will expand value, name is value name, %s means string, %2.2f means flat number format
  println(myth)
  //row -interpolator
  println(raw"This is a \n newline")
  //back slash will not be escaped
  val escaped = "This is a \n newline"
  println(raw"$escaped")
  








}
