package Lectures.part2oop

object OOBasics extends App{
  val person = new Person("John",26)
  println(person.age)
  person.greet("Daniel")

}

//constructor
class Person(name:String, val age:Int){
  //body
  val x =2
  //x=2 is file as well
  println(1+3)
  def greet(name:String) :Unit = println(s"${this.name} says: Hi, $name")
  //function define inside the class defination called method

  //overloading, function with same name but different signatures
  def great():Unit = println(s"Hi, i AM $name")

  //multiple constructors
  def this(name:String) = this(name,0)
  def this()=this("John Doe")





}
//name and age is a class parameter not a class member, need to add val before them
//constructor says every single instance of person must be constructed by passing in a name and age
//class parameters and class field are two different thing



