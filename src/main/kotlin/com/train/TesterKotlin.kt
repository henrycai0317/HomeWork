package com.train

import java.util.*

fun main() {
    var tickets =0;
    while(tickets != -1){
    print("Please enter number of tickets:")
        tickets= readLine()!!.toInt()
        if(tickets ==-1){
            println("Thank you for coming ,see you next time ～")
        }else{
    print("How many round-trip tickets: ");
        var roundTrip= readLine()!!.toInt()
       var tic = TrainTic(tickets,roundTrip)
     tic.show()
        }
    }
}
class TrainTic(var tickets: Int,var roundTrip:Int){
    fun show(){
        println("Total tickets :$tickets\nRound-trip :$roundTrip\nTotal:${getTotal()}")
    }
    private fun getTotal()= (tickets - roundTrip) * 1000 + (roundTrip * 2000) * 0.9
}