package com.train

import java.util.*

fun main() {

    val  scn = Scanner(System.`in`)
    print("Please enter number of tickets:")
    val tickets= scn.nextInt()
    print("How many round-trip tickets: ");
    val roundTrip=scn.nextInt()

     var tic = TrainTic(tickets,roundTrip)
     tic.show()

}
class TrainTic(var tickets: Int,var roundTrip:Int){

    fun show(){
        val total =(tickets-roundTrip)*1000+(roundTrip*2000)*0.9
        println("Total tickets :"+tickets+"\n"
                +"Round-trip:"+roundTrip+"\n"
                +"Total:"+total)
    }
}