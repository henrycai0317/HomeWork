package com.kotlin

import java.util.*


fun main() {
    val box3=Box3()
    val box5=Box5()
    val scn=Scanner(System.`in`)
    var length: Float
    var width: Float
    var height: Int
    var s: String
    var num:Int=0
    println("")
   do {
       println("Please enter your Box size that you want ")
       print("Please enter object's length:")
       s = scn.next()
       length = s.toFloat()
       print("Please enter object's  width: ")
       s = scn.next()
       width = s.toFloat()
       print("Please enter object's height: ")
       s = scn.next()
       height = s.toInt()

       if (box5.validate(length, width, height) && box3.validate(length, width, height)) {
           print("Box5 and Box3 you can use ,choose what you want ?")
           val b = scn.next()
           println("OK buy it ")
           break
       } else if (box5.validate(length, width, height)) {
           println("Try Box5")
           break
       } else if (box3.validate(length, width, height)) {
           println("Try Box3")
           break
       } else {
           print("Sorry that's too big ! try again or you wanna leave (-1) ,continue(1) your answer ?")
           s = scn.next()
           num = s.toInt()
       }
   }while (num != -1);



}

class Box5():Box(39.5f,27.5f,23){}
class Box3():Box(23f,14f,13){}

open class Box(val length: Float,val width:Float,val height:Int){
     fun validate(length: Float,width: Float,height: Int) =
         volume(length, width, height)<=volume(this.length, this.width, this.height)
    fun volume(length: Float,width: Float,height: Int)=length*width*height
}

