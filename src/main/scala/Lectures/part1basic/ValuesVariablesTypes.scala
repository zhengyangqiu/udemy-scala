package Lectures.part1basic

object ValuesVariablesTypes extends App {
  val x: Int = 42
  //val x = 2 is also ok
  println(x)
  //type of val is optional

  val aString: String = "Hello";
  val anotherString = "goodbye"

  val aBoolean: Boolean = false;
  val aChar: Char = 'a'
  val anInt: Int = x
  //4 bits
  val aShort: Short = 4613
  //8 bits
  val aLong: Long = 321321321232312312L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4
  aVariable = 5 //side effects


}
