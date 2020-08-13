package basic.loop

/**
 * Created by dhokim on 2020-08-13
 */

fun fizzBuzz(i:Int) = when{
    i % 15 == 0 -> "FizzBuzz"
    i % 3 == 0 -> "Fizz"
    i % 5 == 0 -> "Buzz"
    else -> "$i"
}