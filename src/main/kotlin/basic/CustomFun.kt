package basic

import basic.`in`.*
import basic.`interface`.*
import basic.collection.joinToString
import basic.common.*
import basic.enumClass.*
import basic.exception.*
import basic.extension.*
import basic.loop.*
import java.io.BufferedReader
import java.io.StringReader

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
    print("8 : ")
    for (i in 1..100 step 2){
        print(fizzBuzz(i)+", ")
    }
    println()
    print("8(reverse) : ")
    for (i in 100 downTo 1 step  2){
        print(fizzBuzz(i)+", ")
    }
    println()
    print("9 : ")
    mapResetAndIteration()
    print("10 : ")
    mapResetAndIterationForInt()
    println("11")
    println("isLetter in 'q' : " + isLetter('q'))
    println("isNotDigit in 'x' : " + isNotDigit('x'))
    println("Recognize : " + recognize('8'))
    likeDictionary()
    likeDictionaryInCollection()
    println(12)
    exception1(11)
    print("13 : " )
    var reader = BufferedReader(StringReader("1"))
    println(readNumber(reader))
    println("14 : " )
    // Collection
    val set = hashSetOf(1, 7, 53)
    val list = arrayListOf(1, 7, 53)
    val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")
    val strings = listOf("first", "second", "fourteenth")
    val numbers = setOf(1, 14, 2)
    println(set)
    println(list)
    println(map)
    println(strings)
    println(numbers)

    println(15)
    val list15 = listOf(1, 2, 3)
    println(joinToString(list15, ";", "(", ")"))
    println(joinToString(list15, separator = ";", postfix =  "(", prefix =  ")")) // 이렇게도 호출 가능

    print("16 : ")
    println("Kotlin".lastChar())
    println("Kotlin".lastCharWithOutThis())

    print("17 : ")
    val list17 = listOf(1, 2, 3)
    println(list17.joinToString(separator = "; ", prefix = "(", postfix = ")"))

    print("18 : ")
    var list18 = arrayListOf(1, 2, 3)
    println(list18.joinToString(""))

    print("19 : ")
    println(listOf("one", "two", "eight").join(" "))
    // println(listOf(1, 2, 8).join(" ")) // 동작이 되지 않는다

    print("20 : ")
    var view:View = Button()
    view.click()

    println("21")
    val view21: View= Button()
    view21.showOff()

}