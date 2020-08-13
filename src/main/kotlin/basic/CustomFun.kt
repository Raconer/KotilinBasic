package basic

import basic.`interface`.*
import basic.common.Rectangle
import basic.common.createRandomRectangle
import basic.enumClass.Color
import basic.enumClass.mix
import basic.enumClass.mixOptimized
import basic.loop.fizzBuzz

/**
 * Created by dhokim on 2020-08-13
 */

fun main(args: Array<String>) {
    val rectangle = Rectangle(41, 41)
    println("1 : " + rectangle.heigth)
    println("2 : " + rectangle.isSquare)
    println("3 : " + createRandomRectangle().isSquare)
    println("4 : " + mix(Color.RED, Color.YELLOW))
    println("5 : " + mixOptimized(Color.BLUE, Color.YELLOW))
    println("6 : " + eval(Sum(Sum(Num(1), Num(2)),Num(4))))
    println("7 : " + evalWithLogging(Sum(Sum(Num(1), Num(2)),Num(4))))
    // Loop
    for (i in 1..100){
        print(fizzBuzz(i))
    }
}

