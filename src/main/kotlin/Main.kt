fun main() {
   println(numbers(2,4,6,8))
continent("AMERICA")
classrooms()
}
 fun numbers( num1:Int,num2:Int,num3:Int,num4:Int):Int {
    var number = arrayOf(2, 4, 6, 8)
     return number.max()
     number.min()
     number.average()

 }
  fun continent(country:String) {
      var x = country
      for (i in x) {
          println(i)
      }
  }
 fun classrooms(){
      var x = "hopperlab"
     var y  = "adalab"
     println("akirachix has $x and $y")
 }
class calculator