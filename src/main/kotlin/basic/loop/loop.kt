package basic.loop

import java.util.*

/**
 * Created by dhokim on 2020-08-13
 */

fun fizzBuzz(i:Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}

fun mapResetAndIteration(){
    val binaryReps = TreeMap<Char, String>()

    for(c in 'A'..'F'){
        val binary = Integer.toBinaryString(c.toInt())
        binaryReps[c] = binary
    }

    for((letter, binary) in binaryReps){
        print("$letter = $binary, ")
    }
    println()
}

fun mapResetAndIterationForInt(){
    val list = arrayListOf("10", "11", "1001")
    for((index, element) in list.withIndex()){
        print("$index = $element , ")
    }
    println()
}