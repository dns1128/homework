package com.train

import java.util.*

fun main() {
    val scanner = Scanner(System.`in`)
    println("Please enter number of tickets:")
    var numticket = scanner.nextInt()
    println("How many round-trip tickets:")
    var roundtripticket = scanner.nextInt()

    val tic = TestKotlin(numticket,roundtripticket)
    tic.print()

}

class TestKotlin(var numticket: Int,var roundtripticket: Int){
        fun print(){
            println("Total tickets:$numticket"+"\t" + "Round-trip: $roundtripticket" +"\t"+ "Total:"+((1000*(numticket-roundtripticket))+(1800*(roundtripticket))))
        }
}