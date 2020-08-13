package basic.`interface`

import java.lang.IllegalArgumentException

/**
 * Created by dhokim on 2020-08-13
 */

interface Expr
class Num(val value: Int) :Expr
class Sum(val left: Expr, val right: Expr) : Expr


fun evalWithLogging(e: Expr):Int =
    when (e){
        is Num ->{
            println("num : ${e.value}")
            e.value
        }
        is Sum -> {
            val left    = evalWithLogging(e.left)
            var right   = evalWithLogging(e.right)
            println("sum: $left + $right")
            left + right
        }
        else ->
            throw IllegalArgumentException("Unknown Expression")
    }

fun eval(e: Expr):Int =
    when (e){
        is Num -> e.value
        is Sum ->
            eval(e.right) + eval(e.left)
        else ->
            throw IllegalArgumentException("Unknown Expression")
    }