package basic.exception

import java.io.BufferedReader
import java.lang.IllegalArgumentException
import java.lang.NumberFormatException

/**
 * Created by dhokim on 2020-08-14
 */

/*
 * 코틀린의 예외 처리는 자바나 다른 언어의 예외 처리와 비슷하다. 함수는 정상적으로 종료할 수 있지만 오류가 발생하면 예외를 던질수 있다.
 * 한수를 호출 하는쪽에서는 그 예외를 잡아 처리할 수 있다.
 * 발생한 예외를 함수 호출 단에서 처리 하지않으면 함수 호출 스택을 거슬러 올라가면서 예외를 처리하는 부분이 나올때 까지 예외를 다시 던진다.
 */

fun exception1(number:Int){
    var percentage =
        if (number in 0..100)
            number
        else
            throw IllegalArgumentException(
                "A percentage value must be between 0 and 100: $number"
            )
    if(percentage !in 0.. 100){
        throw IllegalArgumentException(
            "A percentage value must be between 0 and 100: $percentage"
        )
    }
}

fun readNumber(reader :BufferedReader): Int?{
    try {
        val line = reader.readLine()
        return Integer.parseInt(line)
    }
    catch (e:NumberFormatException){
        return null
    }
    finally {
        reader.close()
    }
}